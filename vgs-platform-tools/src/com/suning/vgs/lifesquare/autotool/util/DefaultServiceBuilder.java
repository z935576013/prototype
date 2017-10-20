package com.suning.vgs.lifesquare.autotool.util;

import java.util.ArrayList;
import java.util.List;

/**
 * DTOBean
 */
public class DefaultServiceBuilder implements Builder {
    /**
     * build
     */
    @Override
    public void build(Bean bean) {
        ServiceBean service = (ServiceBean) bean;
        for (ServiceMethoddBean method : service.getMethod()) {
            String args = method.getMethodArgs();
            String argsDescs = method.getMethodArgsDescs();
            List<ArgBean> argBeanList = new ArrayList<ArgBean>();
            if (args != null && !args.equals("null")) {
                String[] argList = args.split(",");
                String[] descList = argsDescs.split("#");
                for (int i = 0; i < argList.length; i++) {
                    String arg = argList[i].trim();
                    String[] nameType = arg.split(" ");
                    ArgBean argBean = new ArgBean();
                    argBean.setDesc(descList[i]);
                    argBean.setName(nameType[1].trim());
                    argBean.setType(nameType[0].trim());
                    argBeanList.add(argBean);
                }
            }
            method.setArgBeans(argBeanList);
            StringBuffer argsSb = new StringBuffer();
            for (int i = 0; i < argBeanList.size(); i++) {
                ArgBean argBean = argBeanList.get(i);
                argsSb.append(argBean.getType()).append(" ").append(argBean.getName());
                if (i < argBeanList.size() - 1) {
                    argsSb.append(", ");
                }
            }
            method.setMethodArgs(argsSb.toString());
        }

        //

        // service.setClassId(dbName2JavaName(service.getTblId()));
        // service.setClassName(dbName2JavaName(service.getTblName()));
        // for (DTOFieldBean field : service.getFields()) {
        // field.setFieldId(lowFirstChar(dbName2JavaName(field.getColId())));
        // field.setFieldIdCap(dbName2JavaName(field.getColId()));
        // field.setFieldName(field.getColName());
        // if (field.getColComment() == null || "null".equals(field.getColComment())) {
        // field.setFieldComment("");
        // } else {
        // field.setFieldComment(field.getColComment());
        // }
        // field.setFieldType(DataTypeUtil.db2Java(field.getColDataType(), field));
        // if (isPK(field)) {
        // service.addPkFields(field);
        // }
        //
        // String colDataType = field.getColDataType();
        // String colDateTypeWithLength = DataTypeUtil.parseDataTypeForDBSizeDefine(colDataType,
        // field.getColByteLength());
        // field.setColDataTypeWithLength(colDateTypeWithLength);
        // }
    }

    /**
     * isPK
     * 
     * @param field
     * @return
     */
    protected boolean isPK(DTOFieldBean field) {
        if ("YES".equalsIgnoreCase(field.getColPK().trim()) || "true".equalsIgnoreCase(field.getColPK().trim())
                || "Y".equalsIgnoreCase(field.getColPK().trim()) || "○".equalsIgnoreCase(field.getColPK().trim())) {
            return true;
        }
        return false;
    }

    /**
     * dbName2JavaName
     * 
     * @param name
     * @return
     */
    protected String dbName2JavaName(String name) {
        if (!name.contains("_")) {
            return capFirstChar(name.toLowerCase());
        }
        String[] nameSplit = name.split("_");
        StringBuilder builder = new StringBuilder(capFirstChar(nameSplit[0].toLowerCase()));
        for (int i = 1; i < nameSplit.length; i++) {
            builder.append(capFirstChar(nameSplit[i].toLowerCase()));
        }
        return builder.toString();
    }

    /**
     * capFirstChar
     * 
     * @param name
     * @return
     */
    public String capFirstChar(String name) {
        return String.valueOf(name.charAt(0)).toUpperCase() + name.substring(1);
    }

    /**
     * lowFirstChar
     * 
     * @param name
     * @return
     */
    public String lowFirstChar(String name) {
        return String.valueOf(name.charAt(0)).toLowerCase() + name.substring(1);
    }
}
