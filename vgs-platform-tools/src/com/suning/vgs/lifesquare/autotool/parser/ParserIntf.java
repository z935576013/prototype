package com.suning.vgs.lifesquare.autotool.parser;

import java.io.InputStream;
import java.util.List;

import com.suning.vgs.lifesquare.autotool.bean.PhysicalDiagram;
import com.suning.vgs.lifesquare.autotool.bean.Table;

/**
 * 解析PDM的接口封装
 * @author lsg
 *
 */
public interface ParserIntf {
    
    /**
     * 解析指定pdm文件
     * @param pdmFilePath
     * @return
     * @throws Exception
     */
    ParserIntf process(String pdmFilePath) throws Exception;
    
    /**
     * 解析指定PDM文件
     * @param pdmFileStream
     * @return
     * @throws Exception
     */
    ParserIntf process(InputStream pdmFileStream) throws Exception;
    
    /**
     * 取得解析出的所有表
     * @return
     */
    List<Table> getTables();
    
    /**
     * 取得解析出的物理模型对象列表
     * @return
     */
    List<PhysicalDiagram> getPyhsicalDiagrams();
}
