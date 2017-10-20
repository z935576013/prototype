package com.suning.vgs.lifesquare.autotool.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.suning.vgs.lifesquare.autotool.bean.PhysicalDiagram;

public class ObjectSerializable {
    
    /**
     * 持久化为一个.obj对象
     * @param diagrams
     * @throws Exception
     */
    public static void persistVersionInfo(List<PhysicalDiagram> diagrams) throws Exception{
        Date archiveDate = new Date();
        ObjectOutputStream out = new ObjectOutputStream
                (new FileOutputStream("preVersionInfos.obj"));
        out.writeObject(archiveDate);
        out.writeObject(diagrams);
        out.close();
        System.out.println("本次版本生成时间:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(archiveDate));
    }
    
    /**
     * 从持久化对象中取得上次运行时信息
     * @return Map<String,Object>
     *         key: preVersionTime  上次运行时间  Date 类型
     *         key: diagrams        上次运行时解析出的模型对象   List<PhysicalDiagram> 类型
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public static Map<String,Object> takeOutVersionInfo() throws Exception{
        File file = new File("preVersionInfos.obj");
        if (!file.exists()){
            return null;
        }
        
        ObjectInputStream in = new ObjectInputStream
                (new FileInputStream("preVersionDiagrams.obj"));
        Date preArchiveDate = (Date)in.readObject();
        System.out.println("上次版本生成时间:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(preArchiveDate));
        List<PhysicalDiagram> diagrams = (List<PhysicalDiagram>)in.readObject();
        in.close();
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("preVersionTime", preArchiveDate);
        result.put("diagrams", diagrams);
        return result;
    }
}
