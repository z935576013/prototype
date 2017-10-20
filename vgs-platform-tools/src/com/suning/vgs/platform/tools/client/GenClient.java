/*
 * Copyright (C), 2002-2012, 苏宁易购电子商务有限公司
 * FileName: GenClient.java
 * Author:   12070644@cnsuning.com
 * Date:     2012-12-22 上午00:00:00
 */
package com.suning.vgs.platform.tools.client;

import com.suning.vgs.lifesquare.autotool.GenDefult;

/**
 * 自动生成
 * 
 * @author 12070644@cnsuning.com
 */
public class GenClient {
	/**
	 * 功能描述: 模板在template里 ，生成在gen里
	 * 
	 */
	public static void main(String[] args) throws Exception {
		// 通过pdm生成sqlMap、Entity、ddl
		GenDefult.genBeans("source/bravat.pdm");
		// 通过xls生成service的接口和实现类
		// GenDefult.genService("source/service.xls");
		// 通过xls生成logic的接口和实现类
		// GenDefult.genLogic("source/logic.xls");
		// 通申请表生成枚举和SQL
		// GenDefult.genCacheKeyEnum("source/SN_CF09 本地生活广场-数据缓存申请表.xls");
	}

}
