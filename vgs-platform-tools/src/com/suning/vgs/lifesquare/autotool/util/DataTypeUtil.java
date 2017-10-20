package com.suning.vgs.lifesquare.autotool.util;

/**
 * DataTypeMapping
 */
public class DataTypeUtil {
	/**
	 * db2Java
	 * 
	 * @param dbType
	 * @param refField
	 * @return
	 */
	public static String db2Java(String dbType, DTOFieldBean refField) {
		dbType = dbType.toUpperCase();
		if (dbType.startsWith("VARCHAR") || dbType.startsWith("CHAR")
				|| dbType.startsWith("CLOB") || dbType.startsWith("TEXT")
				|| dbType.startsWith("MEDIUMTEXT")) {
			return "String";
		} else if (dbType.startsWith("BLOB")) {
			return "java.sql.Blob";
		} else if (dbType.startsWith("DATE") || dbType.startsWith("TIMESTAMP")
				|| (dbType.startsWith("TIME"))) {
			return "java.util.Date";
		} else if (dbType.startsWith("DOUBLE")) {
			return "Double";
		} else if (dbType.startsWith("NUMBER") || dbType.startsWith("NUMERIC")
				|| dbType.startsWith("DECIMAL") || dbType.startsWith("INTEGER")
				|| dbType.startsWith("DEC") || dbType.startsWith("SMALLINT")
				|| dbType.startsWith("INT")) {

			if (refField.getColLength() == null) {
				return "Integer";
			}
			if (dbType.contains(",")) {
				return "java.math.BigDecimal";
			}
			String len = refField.getColLength().trim();
			if (len.contains(",") || len.contains(".")
					|| "null".equalsIgnoreCase(len)) {
				return "java.math.BigDecimal";
			}
			if (len.contains("-")) {
				len = len.split("-")[1];
			}
			if (len.equals("")) {
				return "Integer";
			}
			int lenAsDec = Integer.valueOf(len);
			if (lenAsDec >= String.valueOf(Long.MAX_VALUE).length()) {
				return "java.math.BigInteger";
			}
			return "Long";
		} else if ("GENERATED-DECIMAL".equals(dbType)) {
			return "java.math.BigDecimal";
		} else if ("GENERATED-INTEGER".equals(dbType)) {
			return "Long";
		} else if ("GENERATED-BIGINT".equals(dbType)) {
			return "Long";
		} else if ("BIGINT".equals(dbType)) {
			return "Long";
		}
		throw new RuntimeException("Found Unknow Data Type: [" + dbType + "] ,"
				+ refField.getColId() + ", " + refField.getColName());
	}

	/**
	 * parseDataLength
	 * 
	 * @param length
	 * @return
	 */
	private static String[] parseDataLength(String length) {
		if (length == null || "null".equalsIgnoreCase(length)) {
			return null;
		}
		if (length.equals("0")) {
			return null;
		}

		String min = null;
		String max = null;
		String precision = null;
		if (length.contains(",")) {
			precision = length.split(",")[1];
			length = length.split(",")[0];
		}
		if (length.contains("-")) {
			min = length.split("-")[0];
			max = length.split("-")[1];
		} else {
			max = min = length;
		}
		return new String[] { min, max, precision };
	}

	/**
	 * parseDataLengthForAnnotation
	 * 
	 * @param length
	 * @return
	 */
	public static String parseDataLengthForAnnotation(String length) {
		String[] result = parseDataLength(length);
		if (result == null) {
			return null;
		}
		String value = result[0] != null ? "min = " + result[0] : "";
		value = result[1] != null ? value + ", max = " + result[1] : value;
		value = result[2] != null ? value + ", precision = " + result[2]
				: value;
		return value;
	}

	/**
	 * parseDataLengthForDBSize
	 * 
	 * @param dataLength
	 * @return
	 */
	public static String parseDataTypeForDBSizeDefine(String dataType,
			String dataLength) {
		String[] result = parseDataLength(dataLength);
		if (result == null) {
			return dataType;
		}
		if (dataType.equalsIgnoreCase("TIMESTAMP")
				|| dataType.equalsIgnoreCase("DATE")
				|| dataType.equalsIgnoreCase("TIME")
				|| dataType.equalsIgnoreCase("BLOB")
				|| dataType.equalsIgnoreCase("CLOB")
				|| dataType.equalsIgnoreCase("GENERATED-INTEGER")
				|| dataType.equalsIgnoreCase("GENERATED-DECIMAL")) {
			return dataType;
		}
		String value = result[1];
		value = result[2] != null ? value + "," + result[2] : value;
		return dataType + "(" + value + ")";
	}
}
