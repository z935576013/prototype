package com.suning.vgs.lifesquare.autotool;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.colorchooser.ColorSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.suning.vgs.lifesquare.autotool.excelcreator.ReferenceCreator;
import com.suning.vgs.lifesquare.autotool.parser.ParserIntf;
import com.suning.vgs.lifesquare.autotool.parser.SimpleSaxParser;
import com.suning.vgs.lifesquare.autotool.util.ObjectSerializable;

public class GuiMain extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = -679158142749345959L;
    // 添加一个颜色对话框窗口
    JFrame color = new JFrame();
    JDialog color_diglog = new JDialog(color, "颜色", true);
    Container contentpane = this.getContentPane();
    JTextArea text = new JTextArea();// 文本域
    JFileChooser filechooser = new JFileChooser();// 文件选择器
    JColorChooser colorchooser = new JColorChooser();// 颜色选择器
    ColorSelectionModel model = colorchooser.getSelectionModel();// 用以获取颜色模型
    // 创建菜单栏
    JMenuBar menubar = new JMenuBar();
    JMenu F_menu = new JMenu("文件(F)"), C_menu = new JMenu("颜色(C)");
    JMenuItem FC = new JMenuItem("打开(文件选择器)"), CC = new JMenuItem("颜色(颜色选择器)");
    JButton btnOpenFile = new JButton("Open");
    JButton btnSaveFile = new JButton("Save");
    JTextField pdmFilePath = new JTextField("pdm 文件路径");
    JTextField excelFilePath = new JTextField("excel 文件路径");
    JList srcSupportedAttributes = new JList();
    JList selectedAttributes = new JList();
    JButton btnAdd = new JButton(">>");
    JButton btnRemove = new JButton("<<");
    
    JLabel lblHeaders = new JLabel("标题列");
    JTextArea taHeaders = new JTextArea();
    
    JLabel lblOneSheetPerTable = new JLabel("数据表与sheet关系");
    JRadioButton radOneSheetOneTable = new JRadioButton("一sheet一表");
    JRadioButton radOneSheetMultiTable = new JRadioButton("一sheet多表");
    
    JLabel lblVersionControl = new JLabel("是否版本控制");
    JRadioButton radVersionControl = new JRadioButton("版本控制");
    JRadioButton radNotVersionControl = new JRadioButton("不进行版本控制");
    
    JLabel lblCreatedColor = new JLabel("新建后显示颜色");
    JRadioButton radCreatedRed = new JRadioButton("红色");
    JRadioButton radCreatedBlue = new JRadioButton("蓝色");
    JRadioButton radCreatedYellow = new JRadioButton("黄色");
    JRadioButton radCreatedGreen = new JRadioButton("绿色");
    
    JLabel lblModifiedColor = new JLabel("修改后显示颜色");
    JRadioButton radModifiedRed = new JRadioButton("红色");
    JRadioButton radModifiedBlue = new JRadioButton("蓝色");
    JRadioButton radModifiedYellow = new JRadioButton("黄色");
    JRadioButton radModifiedGreen = new JRadioButton("绿色");
    
    JLabel lblShowTitle = new JLabel("是否显示标题");
    JRadioButton radShowTitle = new JRadioButton("显示");
    JRadioButton radNotShowTitle = new JRadioButton("不显示");

    
    Vector vSrcAttributes = new Vector();
    Vector vSelectedAttr = new Vector();
    
    
    JButton btnStart = new JButton("Start");
    
    private final String DEFAULT_OPEN_FILE = "pdm文件路径";
    private final String DEFAULT_SAVE_FILE = "要保存的EXCEL文件路径。【注】，如果要自定义保存文件名，需要提供的文件名与pdm文件内的物理模型图数目一样，如不确定，则可不用修改，程序会自动处理";
    private final String DEFAULT_HEADERS = "如要自定义输出时标题列，请在此编辑，【注】提供的标题个数不能少于所选择列数，否则报错，如不填，则程序会自动处理";
    
    private void resetConstraints(GridBagConstraints c){
        c.gridheight = 1;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 0;
    }


    public GuiMain() {
        super("pdm2excel");// 调用父类（JFrame）的构造方法
        contentpane.setSize(800, 500);
        GridBagLayout allLayout = new GridBagLayout();
        
        contentpane.setLayout(allLayout);
        GridBagConstraints c =new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        
        c.gridx = 0;
        c.gridy = 0;
        allLayout.setConstraints(btnOpenFile, c);
        contentpane.add(btnOpenFile);
        resetConstraints(c);
        
        c.gridx = 0;
        c.gridy = 1;
        allLayout.setConstraints(btnSaveFile, c);
        contentpane.add(btnSaveFile);
        resetConstraints(c);
        
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 9;
        allLayout.setConstraints(pdmFilePath, c);
        pdmFilePath.setText(DEFAULT_OPEN_FILE);
        contentpane.add(pdmFilePath);
        resetConstraints(c);
        
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 9;
        allLayout.setConstraints(excelFilePath, c);
        excelFilePath.setText(DEFAULT_SAVE_FILE);
        contentpane.add(excelFilePath);
        resetConstraints(c);
        
        JLabel listDesc = new JLabel("选择EXCEL中要输出的信息.");
        listDesc.setAutoscrolls(true);
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 5;
        allLayout.setConstraints(listDesc, c);
        contentpane.add(listDesc);
        resetConstraints(c);
        
        JLabel listDesc2 = new JLabel("【注】：选中的顺序就是excel中输出的顺序！");
        listDesc.setAutoscrolls(true);
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 5;
        allLayout.setConstraints(listDesc2, c);
        contentpane.add(listDesc2);
        resetConstraints(c);
        
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        c.gridheight = 4;
        vSrcAttributes.add("表名");
        vSrcAttributes.add("表码");
        vSrcAttributes.add("字段名");
        vSrcAttributes.add("字段码");
        vSrcAttributes.add("数据类型");
        vSrcAttributes.add("长度");
        vSrcAttributes.add("是否必填");
        vSrcAttributes.add("默认值");
        vSrcAttributes.add("是否主键");
        vSrcAttributes.add("是否自增");
        vSrcAttributes.add("精度");
        vSrcAttributes.add("注释");
        srcSupportedAttributes.setListData(vSrcAttributes);
        allLayout.setConstraints(srcSupportedAttributes, c);
        contentpane.add(srcSupportedAttributes);
        resetConstraints(c);
        
        c.gridx = 2;
        c.gridy = 5;
        allLayout.setConstraints(btnAdd, c);
        contentpane.add(btnAdd);
        resetConstraints(c);
        
        c.gridx = 2;
        c.gridy = 6;
        allLayout.setConstraints(btnRemove, c);
        contentpane.add(btnRemove);
        resetConstraints(c);
        
        c.gridx = 3;
        c.gridy = 4;
        c.gridheight = 4;
        c.gridwidth = 2;    
        selectedAttributes.setListData(vSelectedAttr);
        allLayout.setConstraints(selectedAttributes, c);
        contentpane.add(selectedAttributes);
        resetConstraints(c);
        
        c.gridx = 5;
        c.gridy = 2;
        allLayout.setConstraints(lblHeaders, c);
        contentpane.add(lblHeaders);
        resetConstraints(c);
        
        c.gridx = 6;
        c.gridy = 2;
        c.gridheight=2;
        c.gridwidth = 4;
        taHeaders.setLineWrap(true);
        taHeaders.setText(DEFAULT_HEADERS);
        taHeaders.setRows(3);
        taHeaders.setColumns(50);
        allLayout.setConstraints(taHeaders, c);
        contentpane.add(taHeaders);
        resetConstraints(c);
        
        ButtonGroup oneSheetPerTable = new ButtonGroup();
        
        c.gridx = 5;
        c.gridy = 4;
        allLayout.setConstraints(lblOneSheetPerTable, c);
        contentpane.add(lblOneSheetPerTable);
        resetConstraints(c);
        
        c.gridx = 7;
        c.gridy = 4;
        c.gridwidth = 2;
        allLayout.setConstraints(radOneSheetMultiTable, c);
        oneSheetPerTable.add(radOneSheetMultiTable);
        contentpane.add(radOneSheetMultiTable);
        resetConstraints(c);
        
        c.gridx = 9;
        c.gridy = 4;
        c.gridwidth = 2;
        radOneSheetOneTable.setSelected(true);
        allLayout.setConstraints(radOneSheetOneTable, c);
        oneSheetPerTable.add(radOneSheetOneTable);
        contentpane.add(radOneSheetOneTable);
        resetConstraints(c);
        
        c.gridx = 5;
        c.gridy = 5;
        allLayout.setConstraints(lblVersionControl, c);
        contentpane.add(lblVersionControl);
        resetConstraints(c);
        
        ButtonGroup bgVersionControl = new ButtonGroup();
        
        c.gridx = 7;
        c.gridy = 5;
        c.gridwidth = 2;
        radVersionControl.setSelected(true);
        allLayout.setConstraints(radVersionControl, c);
        bgVersionControl.add(radVersionControl);
        contentpane.add(radVersionControl);
        resetConstraints(c);
        
        c.gridx = 9;
        c.gridy = 5;
        c.gridwidth = 2;
        allLayout.setConstraints(radNotVersionControl, c);
        bgVersionControl.add(radNotVersionControl);
        contentpane.add(radNotVersionControl);
        resetConstraints(c);
        
        c.gridx = 5;
        c.gridy = 6;
        allLayout.setConstraints(lblCreatedColor, c);
        contentpane.add(lblCreatedColor);
        resetConstraints(c);
        
        ButtonGroup bgCreatedColor = new ButtonGroup();
        
        c.gridx = 6;
        c.gridy = 6;
        radCreatedRed.setSelected(true);
        allLayout.setConstraints(radCreatedRed, c);
        bgCreatedColor.add(radCreatedRed);
        contentpane.add(radCreatedRed);
        resetConstraints(c);
        
        c.gridx = 7;
        c.gridy = 6;
        allLayout.setConstraints(radCreatedGreen, c);
        bgCreatedColor.add(radCreatedGreen);
        contentpane.add(radCreatedGreen);
        resetConstraints(c);
        
        c.gridx = 8;
        c.gridy = 6;
        allLayout.setConstraints(radCreatedBlue, c);
        bgCreatedColor.add(radCreatedBlue);
        contentpane.add(radCreatedBlue);
        resetConstraints(c);
        
        c.gridx = 9;
        c.gridy = 6;
        allLayout.setConstraints(radCreatedYellow, c);
        bgCreatedColor.add(radCreatedYellow);
        contentpane.add(radCreatedYellow);
        resetConstraints(c);
        
        
        c.gridx = 5;
        c.gridy = 7;
        allLayout.setConstraints(lblModifiedColor, c);
        contentpane.add(lblModifiedColor);
        resetConstraints(c);
        
        ButtonGroup bgModifiedColor = new ButtonGroup();
        
        c.gridx = 6;
        c.gridy = 7;
        allLayout.setConstraints(radModifiedRed, c);
        bgModifiedColor.add(radModifiedRed);
        contentpane.add(radModifiedRed);
        resetConstraints(c);
        
        c.gridx = 7;
        c.gridy = 7;
        allLayout.setConstraints(radModifiedGreen, c);
        bgModifiedColor.add(radModifiedGreen);
        contentpane.add(radModifiedGreen);
        resetConstraints(c);
        
        c.gridx = 8;
        c.gridy = 7;
        allLayout.setConstraints(radModifiedBlue, c);
        bgModifiedColor.add(radModifiedBlue);
        contentpane.add(radModifiedBlue);
        resetConstraints(c);
        
        c.gridx = 9;
        c.gridy = 7;
        radModifiedYellow.setSelected(true);
        allLayout.setConstraints(radModifiedYellow, c);
        bgModifiedColor.add(radModifiedYellow);
        contentpane.add(radModifiedYellow);
        resetConstraints(c);
        
        c.gridx =5;
        c.gridy = 8;
        allLayout.setConstraints(lblShowTitle, c);
        contentpane.add(lblShowTitle);
        resetConstraints(c);
        
        ButtonGroup bgShowTitle = new ButtonGroup();
        
        c.gridx = 7;
        c.gridy = 8;
        c.gridwidth = 2;
        bgShowTitle.add(radShowTitle);
        radShowTitle.setSelected(true);
        allLayout.setConstraints(radShowTitle, c);
        contentpane.add(radShowTitle);
        resetConstraints(c);
        
        c.gridx = 9;
        c.gridy = 8;
        c.gridwidth = 2;
        bgShowTitle.add(radNotShowTitle);
        allLayout.setConstraints(radNotShowTitle, c);
        contentpane.add(radNotShowTitle);
        resetConstraints(c);
        
        c.gridx = 7;
        c.gridy = 9;
        allLayout.setConstraints(btnStart, c);
        contentpane.add(btnStart);
        resetConstraints(c);
        
        
        
        initEventBinding();
    }
    
    private void initEventBinding(){
        btnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (srcSupportedAttributes.getSelectedIndices().length > 0){
                    
                    Vector tmp = new Vector();
                    for (int i = srcSupportedAttributes.getSelectedIndices().length-1; i >= 0;i --){
                        if (srcSupportedAttributes.getSelectedIndices()[i] >= vSrcAttributes.size()){
                            continue;
                        }
                        tmp.add(0,vSrcAttributes.get(srcSupportedAttributes.getSelectedIndices()[i]));
                        vSrcAttributes.remove(srcSupportedAttributes.getSelectedIndices()[i]);
                    }
                    vSelectedAttr.addAll(tmp);
                    srcSupportedAttributes.updateUI();
                    selectedAttributes.updateUI();
                }
            }
        });
        
        btnRemove.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (srcSupportedAttributes.getSelectedIndices().length > 0){
                    
                    Vector tmp = new Vector();
                    for (int i = selectedAttributes.getSelectedIndices().length-1; i >= 0;i --){
                        if (selectedAttributes.getSelectedIndices()[i] >= vSelectedAttr.size()){
                            continue;
                        }
                        tmp.add(0,vSelectedAttr.get(selectedAttributes.getSelectedIndices()[i]));
                        vSelectedAttr.remove(selectedAttributes.getSelectedIndices()[i]);
                    }
                    vSrcAttributes.addAll(tmp);
                    srcSupportedAttributes.updateUI();
                    selectedAttributes.updateUI();
                }
            }
        });
        
        btnOpenFile.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                FileNameExtensionFilter pdmFileFilter = new FileNameExtensionFilter("pdm File","pdm");
                filechooser.setFileFilter(pdmFileFilter);
                filechooser.setMultiSelectionEnabled(false);
                int result = filechooser.showOpenDialog(null);
                File file = filechooser.getSelectedFile();
                if (file != null && result == JFileChooser.APPROVE_OPTION){
                    try {
                        pdmFilePath.setText(file.getCanonicalPath());
                    } catch (IOException e) {                       
                        e.printStackTrace();
                    }
                }
            }
        });
        
        btnSaveFile.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                FileNameExtensionFilter excelFileFilter = new FileNameExtensionFilter("excel File","xls");
                filechooser.setFileFilter(excelFileFilter);
                int result = filechooser.showOpenDialog(null);
                File file = filechooser.getSelectedFile();
                if (file != null && result == JFileChooser.APPROVE_OPTION){
                    try{
                        String selectedFilePath = file.getCanonicalPath();
                        excelFilePath.setText(excelFilePath.getText()+";"+selectedFilePath);
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        
        btnStart.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String strPdmFilePath = pdmFilePath.getText().trim();
                if ("".equals(strPdmFilePath) || DEFAULT_OPEN_FILE.equals(strPdmFilePath)){
                    JOptionPane.showMessageDialog(null, "请选择PDM文件");
                    return;
                }
                
                if (vSelectedAttr.size() == 0){
                    JOptionPane.showMessageDialog(null, "请选择输出列");
                    return;
                }
                
                ParserIntf parser = new SimpleSaxParser();
                
                try {
                    parser.process(strPdmFilePath);
                } catch (Exception e) {                 
                    JOptionPane.showMessageDialog(null, "解析pdm文件出错");
                    e.printStackTrace();
                    return;
                }
                
                ReferenceCreator excelCreator = new ReferenceCreator();
                
                String strExcelFilePath = excelFilePath.getText().trim();
                if (!"".equals(strExcelFilePath) && !DEFAULT_SAVE_FILE.equals(strExcelFilePath)){
                    String[] excelPaths = strExcelFilePath.split(";");
                    for (String tmpPath : excelPaths){
                        excelCreator.addOutputFilePath(tmpPath);
                    }                   
                }
                
                for (int i = 0, len = vSelectedAttr.size(); i< len ; i++){
                    String columnName = getColumnNameByName(String.valueOf(vSelectedAttr.get(i)));
                    if (columnName != null){
                        excelCreator.addCreateColumns(columnName);
                    }
                }
                
                String strHeaders = taHeaders.getText().trim();
                if (!"".equals(strHeaders) && !DEFAULT_HEADERS.equals(strHeaders)){
                    String[] headers = strHeaders.split(";");
                    for (String h : headers){
                        excelCreator.addHeader(h);
                    }
                }
                
                if (radOneSheetMultiTable.getSelectedObjects() != null){
                    excelCreator.setOneSheetPerTable(false);
                }else if (radOneSheetOneTable.getSelectedObjects() != null){
                    excelCreator.setOneSheetPerTable(true);
                }
                
                if (radVersionControl.getSelectedObjects() != null){
                    excelCreator.setVersionControl(true);
                    try {
                        Map<String,Object> preVersionInfo = ObjectSerializable.takeOutVersionInfo();
                        if (preVersionInfo != null){
                            Date preVersionTime = (Date)preVersionInfo.get("preVersionTime");
                            excelCreator.setPreVersionTime(preVersionTime.getTime());
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "获取版本信息时出错！");
                        e.printStackTrace();
                        
                    } 
                }else if (radNotVersionControl.getSelectedObjects() != null){
                    excelCreator.setVersionControl(false);
                }
                
                if (radShowTitle.getSelectedObjects() != null){
                    excelCreator.setShowTitle(true);
                }else if (radNotShowTitle.getSelectedObjects() != null){
                    excelCreator.setShowTitle(false);
                }
                
                if (radCreatedRed.getSelectedObjects() != null){
                    excelCreator.setNewCreatedColor("red");
                }else if (radCreatedBlue.getSelectedObjects() != null){
                    excelCreator.setNewCreatedColor("blue");                    
                }else if (radCreatedGreen.getSelectedObjects() != null){
                    excelCreator.setNewCreatedColor("green");
                }else if (radCreatedYellow.getSelectedObjects() != null){
                    excelCreator.setNewCreatedColor("yellow");
                }
                
                if (radModifiedRed.getSelectedObjects() != null){
                    excelCreator.setModifiedCreatedColor("red");
                }else if (radModifiedBlue.getSelectedObjects() != null){
                    excelCreator.setModifiedCreatedColor("blue");                   
                }else if (radModifiedGreen.getSelectedObjects() != null){
                    excelCreator.setModifiedCreatedColor("green");
                }else if (radModifiedYellow.getSelectedObjects() != null){
                    excelCreator.setModifiedCreatedColor("yellow");
                }
                
                try {
                    excelCreator.toExcel(parser);
                    JOptionPane.showMessageDialog(null, "已完成");
                } catch (Exception e) {                 
                    JOptionPane.showMessageDialog(null, "生成过程中出错！");
                    e.printStackTrace();
                    return;
                }
            }
        });
    }
    
    private String getColumnNameByName(String name){
        String result = null;
        if ("表名".equals(name)){
            result = "tableName";
        }else if ("表码".equals(name)){
            result = "tableCode";
        }else if ("字段名".equals(name)){
            result = "columnName";
        }else if ("字段码".equals(name)){
            result = "columnCode";
        }else if ("数据类型".equals(name)){
            result = "dataType";
        }else if ("是否必填".equals(name)){
            result = "mandatory";
        }else if ("默认值".equals(name)){
            result = "defaultValue";
        }else if ("是否主键".equals(name)){
            result = "isPrimary";
        }else if ("是否自增".equals(name)){
            result = "identity";
        }else if ("精度".equals(name)){
            result = "precision";
        }else if ("注释".equals(name)){
            result = "comment";
        }else if ("长度".equals(name)){
            result = "length";
        }
        return result;
    }   


    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        JFrame f = new GuiMain();
        f.setBounds(300, 200, 800, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f.setDefaultLookAndFeelDecorated(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
