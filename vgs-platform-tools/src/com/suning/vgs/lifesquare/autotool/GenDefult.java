package com.suning.vgs.lifesquare.autotool;

import java.io.File;
import java.util.Map;

import com.suning.vgs.lifesquare.autotool.excelcreator.ReferenceCreator;
import com.suning.vgs.lifesquare.autotool.parser.ParserIntf;
import com.suning.vgs.lifesquare.autotool.parser.SimpleSaxParser;
import com.suning.vgs.lifesquare.autotool.util.CodeGenerator;
import com.suning.vgs.lifesquare.autotool.util.DefaultServiceBuilder;
import com.suning.vgs.lifesquare.autotool.util.ExcelParser;
import com.suning.vgs.lifesquare.autotool.util.ServiceBean;

public class GenDefult {

    private static String[] columns = { "tableName", "tableCode", "columnName", "columnCode", "dataType", "mandatory",
            "defaultValue", "isPrimary", "identity", "precision", "precision", "comment", "length" };

    public static void main(String[] args) throws Exception {
         genBeans("平台点评物理模型.pdm");
        // genService("service.xls");
        // genLogic("logic.xls");
//        genCacheKeyEnum("数据缓存申请表.xls");
    }

    public static void genService(String strXlsxFilePath) throws Exception {
        File file = new File(strXlsxFilePath);
        Map<String, ServiceBean> beanMap = new ExcelParser().parseExcelFile(file, new DefaultServiceBuilder());
        String serviceGenPath = "gen/service/";
        if (!new File(serviceGenPath).exists()) {
            new File(serviceGenPath).mkdirs();
        }
        String serviceTemplate = "template/Service.vm";
        String serviceImplTemplate = "template/ServiceImpl.vm";
        CodeGenerator generator = new CodeGenerator(serviceTemplate, "UTF-8");
        for (ServiceBean service : beanMap.values()) {
            String packageName = service.getPackName();
            if (service.getIsBasic().equalsIgnoreCase("true")) {
                service.setPackageName("com.suning.vgs.lifesquare.service.basic.intf." + packageName);
            } else {
                service.setPackageName("com.suning.vgs.lifesquare.service.intf." + packageName);
            }
            String fileName = generator.createPackageDir(serviceGenPath, "") + service.getServiceName() + ".java";
            generator.execute("service", service, fileName);
        }

        generator = new CodeGenerator(serviceImplTemplate, "UTF-8");
        for (ServiceBean service : beanMap.values()) {
            String packageName = service.getPackName();
            if (service.getIsBasic().equalsIgnoreCase("true")) {
                service.setPackageName("com.suning.vgs.lifesquare.service.basic." + packageName);
            } else {
                service.setPackageName("com.suning.vgs.lifesquare.service." + packageName);
            }
            String fileName = generator.createPackageDir(serviceGenPath, "") + service.getServiceName() + "Impl.java";
            generator.execute("service", service, fileName);
        }
    }

    public static void genLogic(String strXlsxFilePath) throws Exception {
        File file = new File(strXlsxFilePath);
        Map<String, ServiceBean> beanMap = new ExcelParser().parseExcelFile(file, new DefaultServiceBuilder());
        String serviceGenPath = "gen/logic/";
        if (!new File(serviceGenPath).exists()) {
            new File(serviceGenPath).mkdirs();
        }
        String serviceTemplate = "template/Service.vm";
        String serviceImplTemplate = "template/ServiceImpl.vm";
        CodeGenerator generator = new CodeGenerator(serviceTemplate, "UTF-8");
        for (ServiceBean service : beanMap.values()) {
            service.setPackageName("com.suning.vgs.lifesquare.logic.intf");
            String fileName = generator.createPackageDir(serviceGenPath, "") + service.getServiceName() + ".java";
            generator.execute("service", service, fileName);
        }

        generator = new CodeGenerator(serviceImplTemplate, "UTF-8");
        for (ServiceBean service : beanMap.values()) {
            service.setPackageName("com.suning.vgs.lifesquare.logic");
            String fileName = generator.createPackageDir(serviceGenPath, "") + service.getServiceName() + "Impl.java";
            generator.execute("service", service, fileName);
        }
    }

    public static void genBeans(String strPdmFilePath) throws Exception {
        String strExcelFileDir = "gen/excel/";
        if (!new File(strExcelFileDir).exists()) {
            new File(strExcelFileDir).mkdirs();
        }
        String strExcelFilePath = strExcelFileDir + "1.xls";
        ParserIntf parser = new SimpleSaxParser();
        parser.process(strPdmFilePath);

        ReferenceCreator excelCreator = new ReferenceCreator();
        excelCreator.addOutputFilePath(strExcelFilePath);
        setColumns(excelCreator);
        excelCreator.setOneSheetPerTable(true);
        excelCreator.setVersionControl(false);
        excelCreator.setShowTitle(true);
        excelCreator.toExcel(parser);
    }

//    public static void genCacheKeyEnum(String strXlsxFilePath) throws Exception {
//        File file = new File(strXlsxFilePath);
//        String genFileDir = "gen/cacheKeyEnum/";
//        if (!new File(genFileDir).exists()) {
//            new File(genFileDir).mkdirs();
//        }
//        Map<String, List<CacheKeyConfigDTO>> map = CacheConfigFileParser.parseXlsFile(file);
//
//        CacheKeyBeans platformCacheKeyBeans = new CacheKeyBeans();
//        List<CacheKeyConfigDTO> platformList = map.get("platform");
//        for (CacheKeyConfigDTO dto : platformList) {
//            CacheKeyConfigBean bean = new CacheKeyConfigBean();
//            bean.setCreator(dto.getCreator());
//            bean.setCacheKey(dto.getCacheKey());
//            bean.setCacheKeyDesc(dto.getCacheKeyDesc());
//            bean.setConfigKey(dto.getConfigKey());
//            bean.setConfigName(dto.getConfigName());
//            bean.setExpireSecond(dto.getExpireSecond());
//            bean.setMultiValue(dto.getMultiValue());
//            bean.setValidFlag(dto.getValidFlag());
//            bean.setUpdateReason(dto.getUpdateReason());
//            bean.setCreator(dto.getCreator());
//            bean.setUpdater(dto.getUpdater());
//            platformCacheKeyBeans.getCacheKeyList().add(bean);
//        }
//        String cacheTemplate = "template/CacheKeyEnum.vm";
//        CodeGenerator generator = new CodeGenerator(cacheTemplate, "UTF-8");
//        String fileName = generator.createPackageDir(genFileDir, "") + "CacheKeyEnum.java";
//        generator.execute("cacheKeyBeans", platformCacheKeyBeans, fileName);
//
//        CacheKeyBeans lifesquareCacheKeyBeans = new CacheKeyBeans();
//        List<CacheKeyConfigDTO> lifesquareList = map.get("lifesquare");
//        for (CacheKeyConfigDTO dto : lifesquareList) {
//            CacheKeyConfigBean bean = new CacheKeyConfigBean();
//            bean.setCreator(dto.getCreator());
//            bean.setCacheKey(dto.getCacheKey());
//            bean.setCacheKeyDesc(dto.getCacheKeyDesc());
//            bean.setConfigKey(dto.getConfigKey());
//            bean.setConfigName(dto.getConfigName());
//            bean.setExpireSecond(dto.getExpireSecond());
//            bean.setMultiValue(dto.getMultiValue());
//            bean.setValidFlag(dto.getValidFlag());
//            bean.setUpdateReason(dto.getUpdateReason());
//            bean.setCreator(dto.getCreator());
//            bean.setUpdater(dto.getUpdater());
//            lifesquareCacheKeyBeans.getCacheKeyList().add(bean);
//        }
//        String lsCacheTemplate = "template/LsCacheKeyEnum.vm";
//        generator = new CodeGenerator(lsCacheTemplate, "UTF-8");
//        fileName = generator.createPackageDir(genFileDir, "") + "LsCacheKeyEnum.java";
//        generator.execute("cacheKeyBeans", lifesquareCacheKeyBeans, fileName);
//
//        CacheKeyBeans cacheKeyBeans = new CacheKeyBeans();
//        List<CacheKeyConfigBean> list = new ArrayList<CacheKeyConfigBean>();
//        list.addAll(platformCacheKeyBeans.getCacheKeyList());
//        list.addAll(lifesquareCacheKeyBeans.getCacheKeyList());
//        cacheKeyBeans.setCacheKeyList(list);
//        
//        String cacheSqlTemplateDb2 = "template/CacheKeySQL_db2.vm";
//        generator = new CodeGenerator(cacheSqlTemplateDb2, "UTF-8");
//        fileName = generator.createPackageDir(genFileDir, "") + "CacheKey_db2.sql";
//        generator.execute("cacheKeyBeans", cacheKeyBeans, fileName);
//        
//        String cacheSqlTemplateMysql = "template/CacheKeySQL_mysql.vm";
//        generator = new CodeGenerator(cacheSqlTemplateMysql, "UTF-8");
//        fileName = generator.createPackageDir(genFileDir, "") + "CacheKey_mysql.sql";
//        generator.execute("cacheKeyBeans", cacheKeyBeans, fileName);
//        
//
//    }

    public static void setColumns(ReferenceCreator excelCreator) {
        for (String columnName : columns) {
            excelCreator.addCreateColumns(columnName);
        }

    }

}
