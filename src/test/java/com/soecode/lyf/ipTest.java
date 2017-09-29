package com.soecode.lyf;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by fengtiepeng on 2017/7/24.
 */
public class ipTest {

    @Test
    public void getIp() throws UnknownHostException {
        String fileIp = InetAddress.getLocalHost().getHostAddress();
        System.out.print(fileIp);
    }


    
}
