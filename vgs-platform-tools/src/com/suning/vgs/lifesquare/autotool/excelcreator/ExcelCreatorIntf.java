package com.suning.vgs.lifesquare.autotool.excelcreator;

import java.util.List;

import com.suning.vgs.lifesquare.autotool.adapter.FormatAdapterIntf;
import com.suning.vgs.lifesquare.autotool.parser.ParserIntf;
import com.suning.vgs.lifesquare.autotool.util.SupportedAttributes;
import com.suning.vgs.lifesquare.autotool.util.SupportedCellColors;

/**
 * 生成Excel的接口
 * @author lsg
 *
 */
public interface ExcelCreatorIntf {
    
    /**
     * 根据parser生成的数据生成EXCEL文件
     * @param parser    所用parser实例
     * @throws Exception
     */
    void toExcel(ParserIntf parser) throws Exception;
    
    /**
     * 获得需要显示的信息列（如，表名，列名，数据类型，是否必填等)
     * @return
     */
    List<SupportedAttributes> getCreateColumns();
    
    /**
     * 获得要显示的标题 ,需与  getCreateColumns() 值一样多
     * @return
     */
    List<String> getHeaders();
    
    /**
     * 取得所用的适配器
     * @return
     */
    FormatAdapterIntf getAdapter();
    
    /**
     * 控制是否显示标题
     * @return  true  显示标题
     *         false  不显示标题
     */
    boolean showTitle();
    
    /**
     * 控制是一个sheet一个表还是所有表都在一个sheet中
     * @return  true 一个数据库表一个sheet
     *         false 所有数据库表在一个sheet中
     */
    boolean oneSheetPerTable();
    
    /**
     * 输出文件路径，必须与PDM中PhysicalDiagrams个数一样多，或不提供，系统将自动用PDM文件中PhysicalDiagram的名字
     * @return
     */
    List<String> getOutputFilePath();
    
    /**
     * 是否进行版本控制，版本控制是可以与指定时间相对应，新生成和修改过的内容将高亮显示
     * @return
     */
    boolean versionControl();
    
    /**
     * 版本控制后，新生成的列显示颜色
     * @return
     */
    SupportedCellColors getNewCreatedColor();
    
    /**
     * 版本控制后，修改过的列显示颜色
     * @return
     */
    SupportedCellColors getModifiedColor();
    
    /**
     * 指定版本控制比较时间
     * @return
     */
    long getPreVersionTime();
        
}
