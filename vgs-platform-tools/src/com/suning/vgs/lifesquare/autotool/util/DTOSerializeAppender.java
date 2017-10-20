package com.suning.vgs.lifesquare.autotool.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Properties;


/**
 * DTOSerializeAppender
 */
public class DTOSerializeAppender {
	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedWriter logger = null;
		try {
			String logFile = DTOSerializeAppender.class.getSimpleName() + new java.text.SimpleDateFormat("-yyyyMMdd").format(new java.util.Date(System.currentTimeMillis())) + ".log.csv";
			logger = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(logFile), CharSet));
			logger.write("Path,File,Modified" + LINE_SEPARATOR);

			for (String path : SourcePathList) {
				appendSerialize(path, logger);
				logger.flush();
			}
			logger.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (logger != null) {
				try {
					logger.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static final String LINE_SEPARATOR = System.getProperty("line.separator");
	private static String CharSet = null;
	private static String Workspace = null;
	private static String[] SourcePathList = null;
	public static String GenPath = null;

	static {
		try {
			Properties prop = FileUtil.loadConfig("config/DTOSerializeAppender.properties");
			CharSet = prop.getProperty("file.charset");
			Workspace = prop.getProperty("workspace.path");
			Workspace = !Workspace.endsWith("/") ? Workspace + "/" : Workspace;
			String srcPath = prop.getProperty("source.path");
			SourcePathList = srcPath.contains(";") ? srcPath.split(";") : new String[] { srcPath.trim() };
			for (int i = 0; i < SourcePathList.length; i++) {
				if (!SourcePathList[i].endsWith("/")) {
					SourcePathList[i] = SourcePathList[i].trim() + "/";
				}
			}
			GenPath = prop.getProperty("gen.path");
			GenPath = !GenPath.endsWith("/") ? GenPath + "/" : GenPath;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * appendSerialize
	 * 
	 * @param path
	 * @param logger
	 * @throws Exception
	 */
	public static void appendSerialize(String path, BufferedWriter logger) throws Exception {
		// List<File> files = FileUtil.listFiles(path, "DTO.java");
		List<File> files = FileUtil.listFiles(path, ".java");
		for (File file : files) {
			String appendSerializableFlag = "NO";
			String fileFullPath = file.getAbsolutePath().replace(file.getName(), "").replace("\\", "/");
			String filePathInWorkspace = fileFullPath.replaceFirst(Workspace, "");
			String newPath = GenPath + filePathInWorkspace;

			if (!new File(newPath).exists()) {
				new File(newPath).mkdirs();
			}
			File newFile = new File(newPath + file.getName());
			BufferedReader reader = null;
			BufferedWriter writer = null;
			try {
				reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), CharSet));
				writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(newFile), CharSet));

				for (String line = reader.readLine(); line != null; line = reader.readLine()) {
					if (line.trim().startsWith("public class")) {
						if (!line.trim().endsWith("{")) {
							String nextLine = null;
							do {
								nextLine = reader.readLine();
								line = line + LINE_SEPARATOR + nextLine;
							} while (nextLine != null && !nextLine.trim().endsWith("{"));
							if (nextLine == null) {
								throw new RuntimeException("No found end '{' for <" + line + ">");
							}
						}
						if (!line.contains(" Serializable") && !line.contains("java.io.Serializable")) {
							line = line.replace("{", "implements java.io.Serializable {\n    /**\n     * serialVersionUID\n     */\n    private static final long serialVersionUID = 1L;\n");
							appendSerializableFlag = "YES";
						}
					}
					writer.write(line);
					writer.write(LINE_SEPARATOR);
					writer.flush();
				}
			} finally {
				logger.write(file.getPath().replace(file.getName(), "") + "," + file.getName() + "," + appendSerializableFlag + LINE_SEPARATOR);
				if (writer != null) {
					try {
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if (reader != null) {
					try {
						reader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			System.out.println("[INFO] <" + file + "> done.");
		}

	}
}
