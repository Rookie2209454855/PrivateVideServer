package com.soecode.lyf.utils;


import javafx.concurrent.Task;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by fengtiepeng on 2017/7/26.
 */
public class taskQue {

    private List<Task> que=new LinkedList<Task>();

    /***
     * 如果任务不为空，将该任务添加进队列
     * @param task
     */
    public synchronized void addTask(Task task){
        if (task != null) {
            que.add(task);
        }
    }


}
