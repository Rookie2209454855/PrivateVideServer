package com.soecode.lyf.web;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.soecode.lyf.dto.Disk;
import com.soecode.lyf.dto.Vide;
import com.soecode.lyf.service.IVidePathService;
import com.soecode.lyf.utils.PageList;
import com.soecode.lyf.utils.init;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengtiepeng on 2017/7/14.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Controller
public class VideServerController {


    @Autowired
    private IVidePathService iVidePathService;


    private static final org.slf4j.Logger logger = LoggerFactory
            .getLogger(VideServerController.class);

    /***
     * 初始化磁盘文件
     * @param dir
     * @return
     */
    @RequestMapping(value="/init",method= RequestMethod.GET)
    @ResponseBody
    public Integer initFilePath(String dir){
        try{
            long startTime= System.currentTimeMillis();//获取程序开始时间
            System.out.print("开始检索");
            String fileName=dir+ File.separator;//表示待查询的为D盘
            File f=new File(fileName);//实例化对象
            List<Vide> videPathList= init.getFile(f);
            int count=iVidePathService.initPath(videPathList);
            long endTime=System.currentTimeMillis();//获取程序结束时间
            System.out.println("程序一共执行了"+(endTime-startTime)+"毫秒!");
            return count;
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            //e.printStackTrace();
            return 0;
        }
    }

    /***
     * 返回所有盘符
     * @return
     */
    @RequestMapping(value="/Disks",method= RequestMethod.GET)
    @ResponseBody
    public List<Disk> resultDisks(){
        List<Disk> diskList=new ArrayList<Disk>();
        FileSystemView fsv = FileSystemView.getFileSystemView();
        // 列出所有windows 磁盘
        File[] fs = File.listRoots();
        // 显示磁盘卷标
        for (int i = 0; i < fs.length; i++) {
            diskList.add(new Disk(fs[i].toString(),fsv.getSystemDisplayName(fs[i])));
        }
        return diskList;
    }

    /***
     * 返回所有盘符
     * @return
     */
    @RequestMapping(value="/DisksMobile",method= RequestMethod.GET)
    @ResponseBody
    public JSONArray resultDiskMobile(){
        JSONArray jsonArray=new JSONArray();
        JSONObject jsonObject;
        FileSystemView fsv = FileSystemView.getFileSystemView();
        // 列出所有windows 磁盘
        File[] fs = File.listRoots();
        // 显示磁盘卷标
        for (int i = 0; i < fs.length; i++) {
            jsonObject=new JSONObject();
            jsonObject.put("value",fs[i].toString());
            jsonObject.put("text",fsv.getSystemDisplayName(fs[i]));
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }


    /***
     * 展示所有视频列表
     * @param name
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/showLink",method =RequestMethod.GET)
    @ResponseBody
    public PageList<Vide> showLink(String name, Integer pageNo, Integer pageSize,String type){
        List<Vide> videList=iVidePathService.findvidePath(new Vide(name,type,(pageNo-1)*pageSize,pageSize));
        Integer count=iVidePathService.findvidePathCount(new Vide(name,type));
        return new PageList<Vide>(count,pageSize,videList);

    }

    /***
     * 跳转播放视频
     * @param id
     * @return
     * @throws UnknownHostException
     */
    @RequestMapping(value = "/showVideo",method =RequestMethod.GET)
    @ResponseBody
    public JSONObject showVideo(Long id)throws UnknownHostException{
        JSONObject jsonObject=new JSONObject();
        System.out.print("sss");
        List<Vide> videList=iVidePathService.findvidePath(new Vide(id));
        Vide vide=videList.get(0);
        String uri=vide.getFileIp()+vide.getFilePath().replace("\\","/");
        jsonObject.put("uri",uri);
        jsonObject.put("videoName",videList.get(0).getName());
        /*model.addAttribute("uri",uri);
        model.addAttribute("videoName",videList.get(0).getName());*/
        return jsonObject;
    }

    /***
     * 跳转下部视频
     * @param id
     * @return
     * @throws UnknownHostException
     */
    @RequestMapping(value = "/showNextVideo",method =RequestMethod.GET)
    @ResponseBody
    public JSONObject showNextVideo(Long id)throws UnknownHostException{
        JSONObject jsonObject=new JSONObject();
        Vide vide=iVidePathService.findvideNextPath(id);
        String uri=vide.getFileIp()+vide.getFilePath().replace("\\","/");
        jsonObject.put("id",vide.getId());
        jsonObject.put("uri",uri);
        jsonObject.put("videoName",vide.getName());
        /*model.addAttribute("uri",uri);
        model.addAttribute("videoName",videList.get(0).getName());*/
        return jsonObject;
    }

    /***
     * 跳转下载视频
     * @param model
     * @param id
     * @return
     * @throws UnknownHostException
     */
    @RequestMapping(value = "/dowloadVideo",method =RequestMethod.GET)
    @ResponseBody
    public String[] dowloadVideo(Model model,Long id)throws UnknownHostException{
        System.out.print("sss");
        List<Vide> videList=iVidePathService.findvidePath(new Vide(id));
        Vide vide=videList.get(0);
        String uri=vide.getFileIp()+":8081/"+vide.getFilePath().replace("\\","/");
        /*model.addAttribute("uri",uri);
        model.addAttribute("videoName",videList.get(0).getName());*/
        return new String[]{uri,videList.get(0).getName()};
    }

    /***
     * 跳转t图片页
     * @return
     * @throws UnknownHostException
     */
    @RequestMapping(value = "/showImages",method =RequestMethod.GET)
    public String showImages()throws UnknownHostException{
        return "iamges/image";
    }



    /***
     * 删除
     * @param vid
     * @return
     */
    @RequestMapping(value = "/delVideo",method =RequestMethod.GET)
    public @ResponseBody Integer delVideo(Long vid)throws SQLException{
        List<Vide> videList=iVidePathService.findvidePath(new Vide(vid));
        Vide vide=videList.get(0);
        Integer num=iVidePathService.delVideoPath(vid);
        if(num!=0){
            init.delFile(vide.getFilePath());
        }
        return num;
    }

}
