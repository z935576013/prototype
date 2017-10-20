package com.suning.vgs.lifesquare.autotool;

import java.util.Date;
import java.util.Map;

import com.suning.vgs.lifesquare.autotool.excelcreator.ExcelCreatorIntf;
import com.suning.vgs.lifesquare.autotool.excelcreator.ReferenceCreator;
import com.suning.vgs.lifesquare.autotool.parser.ParserIntf;
import com.suning.vgs.lifesquare.autotool.parser.SimpleSaxParser;
import com.suning.vgs.lifesquare.autotool.util.FileUtil;
import com.suning.vgs.lifesquare.autotool.util.ObjectSerializable;

/**
 * 
 * @author lsg
 *
 */
public class MainController {

	public void process(String filePath)
			throws Exception {
		String isValid = FileUtil.isValid(filePath);

		if (!"".equals(isValid)) {
			System.out.println("Pdm file is invalid");
		}
		
		Map<String,Object> preVersionInfo = ObjectSerializable.takeOutVersionInfo();
		//List<PhysicalDiagram> preDiagram = (List<PhysicalDiagram>)preVersionInfo.get("diagrams");
		
		ParserIntf parser =  new SimpleSaxParser().process(filePath);		
		
		ObjectSerializable.persistVersionInfo(parser.getPyhsicalDiagrams());		
		
		ReferenceCreator excelCreator = new ReferenceCreator();
		
		excelCreator.setPreVersionTime(((Date)preVersionInfo.get("")).getTime());
		excelCreator.toExcel(parser);
	}
	
	public static void main(String[] args) throws Exception {
		new MainController().process("hotel.pdm");
	}	

}
