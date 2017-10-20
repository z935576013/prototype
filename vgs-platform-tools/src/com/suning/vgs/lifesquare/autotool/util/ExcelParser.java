package com.suning.vgs.lifesquare.autotool.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.ibm.gdc.tool.poi.ExcelAccessor;

/**
 * ExcelParser
 */
public class ExcelParser extends ExcelAccessor {
    /**
     * parseExcelFiles
     * 
     * @param files
     * @throws Exception
     */
    public Map<String, Bean> parseExcelFiles(int type,List<File> files, Builder... builders) throws Exception {
        Map<String, Bean> beanMap = new LinkedHashMap<String, Bean>();
		if (type == 0) {
        for (File file : files) {
            // parse package name from file path
            String nameSpace = file.getParentFile().getName();
                // parse excel data
                DTOBeans beans = new ExcelParser().parseWorkBookDTO(file);
                // append package to ExcelDataBean
                for (Map.Entry<String, DTOBean> entry : beans.getSheets().entrySet()) {
                    DTOBean dto = entry.getValue();
                    dto.setNameSpace(nameSpace);
                    String key = nameSpace + "." + dto.getTblId();
                    if (beanMap.containsKey(key)) {
                        throw new Exception("Found duplicate Table ID in same namespace: " + dto.getTblId());
                    }
                    if (builders != null) {
                        for (Builder builder : builders) {
                            builder.build(dto);
                        }
                    }
                    beanMap.put(key, dto);
                }

            }
        }else{
        	   for (File file : files) {
                   // parse package name from file path
                       // parse excel data
                       ServiceBeans beans = new ExcelParser().parseWorkBookService(file);
                       // append package to ExcelDataBean
                       for (Map.Entry<String, ServiceBean> entry : beans.getSheets().entrySet()) {
                    	   ServiceBean dto = entry.getValue();
                    	 	ServiceBean service = entry.getValue();
                            String key = service.getServiceName();
                           if (beanMap.containsKey(key)) {
                               throw new Exception("Found duplicate service ID in same namespace: " + service.getServiceName());
                           }
                           if (builders != null) {
                               for (Builder builder : builders) {
                                   builder.build(dto);
                               }
                           }
                           beanMap.put(key, dto);
                       }

                   }
        }
        return beanMap;
    }
    
    /**
     * parseExcelFile
     * 
     * @param files
     * @throws Exception
     */
    public Map<String, DTOBean> parseExcelFile(File file, DefaultDTOBuilder... builders) throws Exception {
        Map<String, DTOBean> beanMap = new LinkedHashMap<String, DTOBean>();
            // parse package name from file path
            String nameSpace = "com.suning.vgs.lifesquare.integration.entity";
            // parse excel data
            DTOBeans beans = new ExcelParser().parseWorkBookDTO(file);
            // append package to ExcelDataBean
            for (Map.Entry<String, DTOBean> entry : beans.getSheets().entrySet()) {
                DTOBean dto = entry.getValue();
                dto.setNameSpace(nameSpace);
                String key = nameSpace + "." + dto.getTblId();
                if (beanMap.containsKey(key)) {
                    throw new Exception("Found duplicate Table ID in same namespace: " + dto.getTblId());
                }
                if (builders != null) {
                    for (DefaultDTOBuilder builder : builders) {
                        builder.build(dto);
                    }
                }
                beanMap.put(key, dto);
            }
        return beanMap;
    }

    /**
     * parseExcelFile
     * 
     * @param files
     * @throws Exception
     */
    public Map<String, ServiceBean> parseExcelFile(File file, DefaultServiceBuilder... builders) throws Exception {
        Map<String, ServiceBean> beanMap = new LinkedHashMap<String, ServiceBean>();
            // parse package name from file path
            // parse excel data
            ServiceBeans beans = new ExcelParser().parseWorkBookService(file);
            // append package to ExcelDataBean
            for (Map.Entry<String, ServiceBean> entry : beans.getSheets().entrySet()) {
            	ServiceBean service = entry.getValue();
                String key = service.getServiceName();
                if (beanMap.containsKey(key)) {
                    throw new Exception("Found duplicate Service ID in same namespace: " + service.getServiceName());
                }
                if (builders != null) {
                    for (DefaultServiceBuilder builder : builders) {
                        builder.build(service);
                    }
                }
                beanMap.put(key, service);
            }
        return beanMap;
    }
    
    
    /**
     * parseExcelFile
     * 
     * @param files
     * @throws Exception
     */
    public Map<String, ServiceBean> parseExcelFile(File file, DefaultCacheKeyBuilder... builders) throws Exception {
        Map<String, ServiceBean> beanMap = new LinkedHashMap<String, ServiceBean>();
            // parse package name from file path
            // parse excel data
            ServiceBeans beans = new ExcelParser().parseWorkBookService(file);
            // append package to ExcelDataBean
            for (Map.Entry<String, ServiceBean> entry : beans.getSheets().entrySet()) {
                ServiceBean service = entry.getValue();
                String key = service.getServiceName();
                if (beanMap.containsKey(key)) {
                    throw new Exception("Found duplicate Service ID in same namespace: " + service.getServiceName());
                }
                if (builders != null) {
                    for (DefaultCacheKeyBuilder builder : builders) {
                        builder.build(service);
                    }
                }
                beanMap.put(key, service);
            }
        return beanMap;
    }
    
    /**
     * parseWorkBook
     * 
     * @param excelFile
     * @return
     * @throws Exception
     */
    protected DTOBeans parseWorkBookDTO(File excelFile) throws Exception {
        HSSFWorkbook book = loadExcel(excelFile);
        DTOBeans excelDataBeans = new DTOBeans();

        for (int i = 0; i < book.getNumberOfSheets(); i++) {
            String sheetName = book.getSheetName(i);
            if (sheetName.startsWith("#")) {
                continue;
            }
            // Is target sheet
            HSSFSheet sheet = book.getSheetAt(i);
            DTOBean excelDataBean =(DTOBean)parseWorkSheet(excelFile, sheetName, sheet,0);
            excelDataBeans.addSheet(sheetName, excelDataBean);
        }
        return excelDataBeans;
    }
    /**
     * parseWorkBook
     * 
     * @param excelFile
     * @return
     * @throws Exception
     */
    protected ServiceBeans parseWorkBookService(File excelFile) throws Exception {
        HSSFWorkbook book = loadExcel(excelFile);
        ServiceBeans excelDataBeans = new ServiceBeans();

        ServiceListBean serviceListBean=new ServiceListBean();
        
        for (int i = 0; i < book.getNumberOfSheets(); i++) {
            String sheetName = book.getSheetName(i);
            if (sheetName.startsWith("#")) {
                continue;
            }
            if(sheetName.endsWith("总览")){
            	HSSFSheet sheet = book.getSheetAt(i);
            	serviceListBean =(ServiceListBean)parseWorkSheet(excelFile, sheetName, sheet,2);
            }else{
            	HSSFSheet sheet = book.getSheetAt(i);
            	ServiceBean excelDataBean =(ServiceBean)parseWorkSheet(excelFile, sheetName, sheet,1);
            	excelDataBean.setDesc(serviceListBean.getServiceDescMap().get(excelDataBean.getServiceName()));
            	excelDataBean.setIsBasic(serviceListBean.getServiceBasicMap().get(excelDataBean.getServiceName()));
            	excelDataBean.setPackName(serviceListBean.getServicePackgeMap().get(excelDataBean.getServiceName()));
            	excelDataBeans.addSheet(sheetName, excelDataBean);
            }
        }
        
        return excelDataBeans;
    }
    
    /**
     * parseWorkSheet
     * 
     * @param excelFile
     * @param sheetName
     * @param sheet
     * @return
     * @throws Exception
     */
    protected Bean parseWorkSheet(File excelFile, String sheetName, HSSFSheet sheet,int type) throws Exception {
       

        int[] targetColIndexes = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        int startRowNum = 0;
        List<List<Object>>  rows = readSheetAsObjectList(excelFile, sheetName, targetColIndexes, startRowNum, Integer.MAX_VALUE);
        
        Map<String,Integer> titleMap=new HashMap<String,Integer>();
        List<Object> titleRow=rows.get(0);
        int size=titleRow.size();
        for(int i=0;i<size;i++){
            String title=(String)titleRow.get(i);
                titleMap.put(title, i);
        }
        rows.remove(titleRow);
        if(type==0){
        	DTOBean bean = new DTOBean();
        	bean.setTblId(sheetName);
            for (List<Object> row : rows) {
                DTOFieldBean field = new DTOFieldBean();
//                field.setColNo(String.valueOf(row.get(titleMap.get(""))).trim());
                field.setIdentity(String.valueOf(row.get(titleMap.get("自增"))).trim());
                field.setColName(String.valueOf(row.get(titleMap.get("列名"))).trim());
                field.setColId(String.valueOf(row.get(titleMap.get("列码"))).trim());
                field.setColDataType(String.valueOf(row.get(titleMap.get("类型"))).trim());
//                field.setColReference(String.valueOf(row.get(titleMap.get(""))).trim());
                field.setColLength(String.valueOf(row.get(titleMap.get("长度"))).trim());
//                field.setColByteLength(String.valueOf(row.get(titleMap.get(""))).trim());
                field.setColPK(String.valueOf(row.get(titleMap.get("主键"))).trim());
//                field.setColFK(String.valueOf(row.get(titleMap.get(""))).trim());
                field.setColNotNull(String.valueOf(row.get(titleMap.get("必填"))).trim());
//                field.setColMinValue(String.valueOf(row.get(titleMap.get(""))).trim());
//                field.setColMaxValue(String.valueOf(row.get(titleMap.get(""))).trim());
                field.setColDefaultValue(String.valueOf(row.get(titleMap.get("默认值"))).trim());
//                field.setColIndexName(String.valueOf(row.get(titleMap.get(""))).trim());
                field.setColComment(String.valueOf(row.get(titleMap.get("注释"))).trim());
                bean.setTblName(String.valueOf(row.get(titleMap.get("表名"))).trim());
                bean.getFields().add(field);
            }
            return bean;
        }else if (type==1){
        	ServiceBean bean = new ServiceBean();
        	bean.setServiceName(sheetName);
            for (List<Object> row : rows) {
            	ServiceMethoddBean method = new ServiceMethoddBean();
                method.setMethodArgs(String.valueOf(row.get(titleMap.get("方法入参"))).trim());
                method.setMethodDesc(String.valueOf(row.get(titleMap.get("方法说明"))).trim());
                method.setMethodName(String.valueOf(row.get(titleMap.get("方法名"))).trim());
                method.setMethodRet(String.valueOf(row.get(titleMap.get("返回值"))).trim());
                method.setMethodRetDesc(String.valueOf(row.get(titleMap.get("返回值说明"))).trim());
                method.setMethodArgsDescs(String.valueOf(row.get(titleMap.get("入参说明"))).trim());
                bean.getMethod().add(method);
            }
            return bean;
        }else if (type==2){
        	ServiceListBean bean = new ServiceListBean();
        	Map<String,String> serviceDescMap=new HashMap<String,String>();
        	Map<String,String> serviceBasicMap=new HashMap<String,String>();
        	Map<String,String> servicePackgeMap=new HashMap<String,String>();
            for (List<Object> row : rows) {
            	String name=String.valueOf(row.get(titleMap.get("名称"))).trim();
            	String desc=String.valueOf(row.get(titleMap.get("说明"))).trim();
            	String isBasic=String.valueOf(row.get(titleMap.get("是basic"))).trim();
            	String packageName=String.valueOf(row.get(titleMap.get("包"))).trim();
            	serviceDescMap.put(name, desc);
            	serviceBasicMap.put(name, isBasic);
            	servicePackgeMap.put(name, packageName);
            }
            bean.setServiceBasicMap(serviceBasicMap);
            bean.setServiceDescMap(serviceDescMap);
            bean.setServicePackgeMap(servicePackgeMap);
            return bean;
        }else if (type==3){
            ServiceListBean bean = new ServiceListBean();
            Map<String,String> serviceDescMap=new HashMap<String,String>();
            Map<String,String> serviceBasicMap=new HashMap<String,String>();
            Map<String,String> servicePackgeMap=new HashMap<String,String>();
            for (List<Object> row : rows) {
                String name=String.valueOf(row.get(titleMap.get("名称"))).trim();
                String desc=String.valueOf(row.get(titleMap.get("说明"))).trim();
                String isBasic=String.valueOf(row.get(titleMap.get("是basic"))).trim();
                String packageName=String.valueOf(row.get(titleMap.get("包"))).trim();
                serviceDescMap.put(name, desc);
                serviceBasicMap.put(name, isBasic);
                servicePackgeMap.put(name, packageName);
            }
            return bean;
        }else{
        	return null;
        }
    }

    /**
     * isEndRow
     * 
     * @param <E>
     * @param row
     * @return
     */
    @Override
    protected <E> boolean isEndRow(List<E> row) {
        if (row.get(0) == null || "null".equalsIgnoreCase(row.get(0).toString()))
            return true;
        else
            return false;
    }

    /**
     * Load Excel as HSSFWorkbook
     * 
     * @param excelFile
     * @return org.apache.poi.ss.usermodel.Workbook
     */
    protected HSSFWorkbook loadExcel(File excelFile) {
        HSSFWorkbook book = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(excelFile);
            book = new HSSFWorkbook(fis);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return book;
    }
}
