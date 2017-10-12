package com.soecode.lyf.utils;

import com.mchange.v2.c3p0.DataSources;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;

/**
 * Created by fengtiepeng on 2017/10/10.
 */
@WebListener()
public class DBClose implements ServletContextListener {


    /*

     * (non-Javadoc)

     *

     * @see

     * javax.servlet.ServletContextListener#contextInitialized(javax.servlet

     * .ServletContextEvent)

     */

    @Override

    public void contextInitialized(ServletContextEvent sce) {

    }



    /*

     * (non-Javadoc)

     *

     * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.

     * ServletContextEvent)

     */

    @Override

    public void contextDestroyed(ServletContextEvent sce) {



        //TODO 这里需要修改一下，得到dataSource

        DataSource dataSource = null;



        try

        {

            //调用c3p0的关闭数据库连接的方法

            DataSources.destroy(dataSource);

        }

        catch (Exception e)

        {

            e.printStackTrace();

        }





        //等待连接池关闭线程退出，避免Tomcat报线程未关闭导致memory leak的错误

        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }

}
