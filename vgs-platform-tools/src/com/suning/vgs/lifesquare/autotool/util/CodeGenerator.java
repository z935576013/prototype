package com.suning.vgs.lifesquare.autotool.util;

import java.io.File;
import java.io.FileWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

/**
 * EntityGenerator
 */
public class CodeGenerator {
    /**
     * template
     */
    Template template;
    /**
     * CodeGenerator
     * @param vltTemplate
     * @param charSet
     */
    public CodeGenerator(String vltTemplate, String charSet) {
        try {
            Velocity.init();
            template = Velocity.getTemplate(vltTemplate, charSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * execute
     * @param dtoMap
     * @param genSrcPath
     * @param vltTemplate
     * @param charSet
     * @throws Exception
     */
    public void execute(String inputDTOName, Object inputDTO, String fileName) throws Exception {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName);
            VelocityContext context = new VelocityContext();
            context.put(inputDTOName, inputDTO);
            template.merge(context,writer);
            writer.flush();
            System.out.println("[" + fileName + "] created.");
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    /**
     * createPackageDir
     * @param rootPath
     * @param packageName
     * @return
     */
    public String createPackageDir(String rootPath, String packageName) {
        rootPath = rootPath.contains("\\") ? rootPath.replace("\\", "/") : rootPath;
        rootPath = rootPath.endsWith("/") ? rootPath : rootPath + "/";
        packageName = packageName.replace(".", "/");
        packageName = rootPath + packageName;
        File p = new File(packageName);
        if (!p.exists()) {
            p.mkdirs();
        }
        return p.getPath() + "/";
    }
}
