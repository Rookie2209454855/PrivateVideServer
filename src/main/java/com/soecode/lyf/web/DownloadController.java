package com.soecode.lyf.web;


import com.sun.deploy.net.URLEncoder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.security.util.DerEncoder;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.*;
import java.util.Random;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/download")
public class DownloadController {

    private Log logger= LogFactory.getLog(DownloadController.class);

    /***
     * 下载方法
     * @param uri
     * @param disk
     * @param project
     * @throws MalformedURLException
     */
    @RequestMapping(value = "/dw",method = RequestMethod.POST)
    @ResponseBody
    public void downloadNet(String uri, String disk, String project,String filename) throws MalformedURLException {
        HttpServletResponse response;
        // 下载网络文件
        int bytesum = 0;
        int byteread = 0;
        InputStream inStream=null;
        FileOutputStream fs=null;
        try {
            filename= URLDecoder.decode(filename,"gbk");
            URL url = new URL(uri.trim());
            URLConnection conn = url.openConnection();
            inStream= conn.getInputStream();
            String suffix = uri.substring(uri.lastIndexOf("."), uri.length());
            File file = new File(disk.toUpperCase() +  project);
            if (!file.exists()) {
                file.mkdir();
            }
            //是否自动生成文件名
            String creatfile;
            if(filename!=null){
                creatfile =file + "//" + filename + suffix;//自定义文件名
            }else {
                creatfile =file + "//" + new Random().nextInt() + suffix;//随机文件名
            }
            fs = new FileOutputStream(creatfile);
            byte[] buffer = new byte[4096];
            while ((byteread = inStream.read(buffer)) != -1) {
                bytesum += byteread;
                System.out.println(bytesum);
                fs.write(buffer, 0, byteread);
            }

        } catch (FileNotFoundException e) {
            logger.error("文件异常",e);
            e.printStackTrace();
        } catch (IOException e) {
            logger.error("io异常",e);
            e.printStackTrace();
        }finally {
            try {
                if (null != inStream) {
                    inStream.close();
                }
                if (null != fs) {
                    fs.close();
                }
            }catch (IOException io){
                io.printStackTrace();
            }

        }
    }


    public static void dowanload(String url, String path)
            throws IOException {
        System.out.println("下载中...");
        InputStream inputStream = null;
        RandomAccessFile randomAccessFile = null;
        try {
            HttpURLConnection urlConnection = (HttpURLConnection) new URL(url).openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setConnectTimeout(10 * 1000);
            File file = new File(path);
            if (!file.getParentFile().exists())
                file.getParentFile().mkdir();
            if (file.exists())
                file.delete();
            file.createNewFile();
            int responseCode = urlConnection.getResponseCode();
            if (responseCode >= 200 && responseCode < 300) {
                inputStream = urlConnection.getInputStream();
                int len = 0;
                byte[] data = new byte[4096];
                int progres = 0; //用于保存当前进度（具体进度）
                int maxProgres = urlConnection.getContentLength();//获取文件
                randomAccessFile = new RandomAccessFile(file, "rwd");
                randomAccessFile.setLength(maxProgres);//设置文件大小
                int unit = maxProgres / 100;//将文件大小分成100分，每一分的大小为unit
                int unitProgress = 0; //用于保存当前进度(1~100%)
                while (-1 != (len = inputStream.read(data))) {
                    randomAccessFile.write(data, 0, len);
                    progres += len;//保存当前具体进度
                    int temp = progres / unit; //计算当前百分比进度
                    if (temp >= 1 && temp > unitProgress) {//如果下载过程出现百分比变化
                        unitProgress = temp;//保存当前百分比
                        System.out.println("正在下载中..." + unitProgress + "%");
                    }
                }
                inputStream.close();
                System.out.println("下载完成...");
            } else {
                System.out.println("服务器异常...");
            }
        } finally {
            if (null != inputStream) {
                inputStream.close();
            }
            if (null != randomAccessFile) {
                randomAccessFile.close();
            }
        }
    }

}
