package com.soecode.lyf.utils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public  class  Doc {
    public File file=get();//获得.txt文件  
    static List<String>list=new LinkedList<String>();//创建list集合，用来暂时储存
    public static File get()  
    {  
        File file=new File("C:\\Users\\fengtiepeng\\Desktop\\Doc.txt");//创建的.txt问价的位置
        if(file.exists())//如果已经存在了  
            file.delete();//删除之  
        else  
        {  
            try  
            {  
                file.createNewFile();//如果不存在，就创建一个  
            }  
            catch(IOException e)  
            {  
                e.printStackTrace();  
            }  
        }  
        return file;  
    }


    public static void main(String args[])  
    {
        System.out.print("开始检索");
        long startTime= System.currentTimeMillis();//获取程序开始时间  
        String fileName="D:"+File.separator;//表示待查询的为D盘  
        File f=new File(fileName);//实例化对象  
        print(f);//打印  
        write(list);//写到.txt文件内  
        long endTime=System.currentTimeMillis();//获取程序结束时间  
        System.out.println("程序一共执行了"+(endTime-startTime)+"毫秒!");  
    }


    public static void write(List<String> list) {
    // TODO Auto-generated method stub  
        File file=get();  
        try {  
            FileWriter writer = new FileWriter(file);  
            for(int i=0;i<list.size();i++)  
            {  
                String str=list.get(i);  
                writer.write(str);//写入.txt文件内  
                writer.write("\r\n");  
            }  
            writer.close();//关闭流  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
      
}


    public static void print(File f) {
        // TODO Auto-generated method stub
        if(f!=null)//如果当前文件不为空
        {
            if(f.isDirectory())//如果当前文件是个文件夹
            {
                //String Name= f.getAbsolutePath();//输出文件夹名字
                //list.add("++++++++"+Name+"++++++++++++++");
                File[] fileArray = f.listFiles();//获取当前文件夹的子文件
                if(fileArray!=null)//
                {
                    for(int i=0;i<fileArray.length;i++)
                    {
                        print(fileArray[i]);//递归子文件
                    }
                }
            }
            else
            {
                String name=f.getAbsolutePath();//如果当前这个不是文件夹
                list.add(name);//获取抽象路径名的绝对路径名字符串，存入list数组里边
            }
        }
    }


}  