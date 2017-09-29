package com.soecode.lyf.utils;


import com.soecode.lyf.dto.Vide;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by fengtiepeng on 2017/7/14.
 */
public  class init {
     static List<Vide> list=new LinkedList<Vide>();//创建list集合，用来暂时储存
     static Map<String,String> videoType=new HashMap<String,String>();
     static Map<String,String> reMap(){
        //videoType.put("avi","avi");
        //videoType.put("AVI","avi");
        videoType.put("MP4","mp4");
        videoType.put("mp4","mp4");
        //videoType.put("rmvb","rmvb");
        //videoType.put("RMVB","rmvb");
        videoType.put("jpg","jpg");
        videoType.put("JPG","jpg");
        //videoType.put("bmp","bmp");
        //videoType.put("png","png");
        return videoType;
    }

    /***\
     * 筛选硬盘文件集合
     * @param file
     * @return
     */
    public static List<Vide> getFile(File file)throws UnknownHostException{
        String fileIp = "http://"+InetAddress.getLocalHost().getHostAddress();
        if(file!=null) {//如果当前文件不为空
            if (file.isDirectory())//如果当前文件是个文件夹
            {
                //String Name= f.getAbsolutePath();//输出文件夹名字
                //list.add("++++++++"+Name+"++++++++++++++");
                File[] fileArray = file.listFiles();//获取当前文件夹的子文件
                if (fileArray != null)//
                {
                    for (int i = 0; i < fileArray.length; i++) {
                        getFile(fileArray[i]);//递归子文件
                    }
                }
            } else {
                String filepath = file.getPath();//如果当前这个不是文件夹
                String name=file.getName();
                int start=name.indexOf(".");
                if(start!=-1){
                    String typ=name.substring(start+1,name.length());
                    if(reMap().get(typ)!=null){
                        System.out.print(reMap().get(typ));
                        Vide videPath=new Vide(name,reMap().get(typ),filepath,fileIp);
                        list.add(videPath);//获取抽象路径名的绝对路径名字符串，存入list数组里边}
                    }
                }
            }

        }
        return  list;
    }


    /***
     * 文件删除工具
     * @param filePath
     * @return
     */
    public static Boolean delFile(String filePath){
        File file=new File(filePath);
        return  file.delete();
    }
}
