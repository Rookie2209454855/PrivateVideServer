package com.soecode.lyf.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class download {

    public void downloadNet(String uri, String disk, String project) throws MalformedURLException {
        HttpServletResponse response;
        // 下载网络文件
        int bytesum = 0;
        int byteread = 0;
        try {
            URL url = new URL(uri.trim());
            URLConnection conn = url.openConnection();
            InputStream inStream = conn.getInputStream();
            String suffix = uri.substring(uri.lastIndexOf("."), uri.length());
            System.out.println(suffix);
            System.out.println(disk.toUpperCase() + "://" + project + "//" + new Random().nextInt() + suffix);
            File file = new File(disk.toUpperCase() + "://" + project);
            if (!file.exists()) {
                file.mkdir();
            }
            FileOutputStream fs = new FileOutputStream(file + "//" + new Random().nextInt() + suffix);
            byte[] buffer = new byte[1204];
            int length;
            while ((byteread = inStream.read(buffer)) != -1) {
                bytesum += byteread;
                System.out.println(bytesum);
                fs.write(buffer, 0, byteread);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
