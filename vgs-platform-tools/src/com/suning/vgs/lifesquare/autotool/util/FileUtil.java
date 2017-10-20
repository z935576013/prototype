package com.suning.vgs.lifesquare.autotool.util;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * FileUtil
 */
public class FileUtil {
	/**
	 * @param configFile
	 * @return
	 */
	public static Properties loadConfig(String configFile) {
		Properties prop = new Properties();
		try {
			prop.load(new java.io.FileInputStream(configFile));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

	/**
	 * @param rootPath
	 * @param fileType
	 * @return
	 */
	public static List<File> listFiles(String rootPaths, final String fileType) {
		rootPaths = rootPaths.contains("\\\\") ? rootPaths.replace("\\\\", "/") : rootPaths;
		rootPaths = rootPaths.contains("\\") ? rootPaths.replace("\\", "/") : rootPaths;
		String[] paths = null;
		if (rootPaths.contains(";")) {
			paths = rootPaths.split(";");
		} else {
			paths = new String[] { rootPaths };
		}

		List<File> result = new ArrayList<File>();
		for (String path : paths) {
			listFiles(result, new File(path), fileType, null);
		}
		return result;
	}

	/**
	 * listFiles
	 * 
	 * @param rootPaths
	 * @param fileType
	 * @param exclueFileTypes
	 * @return
	 */
	public static List<File> listFiles(String rootPaths, final String fileType, final String[] exclueFileTypes) {
		rootPaths = rootPaths.contains("\\\\") ? rootPaths.replace("\\\\", "/") : rootPaths;
		rootPaths = rootPaths.contains("\\") ? rootPaths.replace("\\", "/") : rootPaths;
		String[] paths = null;
		if (rootPaths.contains(";")) {
			paths = rootPaths.split(";");
		} else {
			paths = new String[] { rootPaths };
		}

		List<File> result = new ArrayList<File>();
		for (String path : paths) {
			listFiles(result, new File(path), fileType, exclueFileTypes);
		}
		return result;
	}

	/**
	 * listFiles
	 * 
	 * @param result
	 * @param path
	 * @param fileType
	 */
	private static void listFiles(List<File> result, File path, final String fileType, final String[] exclueFileTypes) {
		File[] files = path.listFiles(new FileFilter() {
			@Override
			public boolean accept(File f) {
				if (f.isFile() && f.getName().toUpperCase().endsWith(fileType.toUpperCase())) {
					if (exclueFileTypes != null) {
						for (String exclueFileType : exclueFileTypes) {
							if (f.getName().toUpperCase().endsWith(exclueFileType.toUpperCase())) {
								return false;
							}
						}
					}
					return true;
				}
				return false;
			}
		});

		if (files != null) {
			for (File f : files) {
				result.add(f);
			}
		}

		File[] subPaths = path.listFiles(new FileFilter() {
			@Override
			public boolean accept(File f) {
				if (f.isDirectory()) {
					return true;
				}
				return false;
			}
		});

		if (subPaths != null) {
			for (File p : subPaths) {
				listFiles(result, p, fileType, exclueFileTypes);
			}
		}
	}
	public static String isValid(String filePath){
        if (filePath == null || "".equals(filePath.trim())){
            return "file is not assigned!";
        }
        filePath = filePath.trim();
        if (filePath.length() <= 4){
            return "file is invalid!";
        }
        /*if ("pdm".equals(filePath.substring(filePath.lastIndexOf("//")).toLowerCase())){
            return "file is not pdm file!";
        }*/ 
        return "";
    }
}
