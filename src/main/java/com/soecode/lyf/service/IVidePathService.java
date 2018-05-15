package com.soecode.lyf.service;


import com.soecode.lyf.dto.Vide;

import java.util.List;

/**
 * Created by fengtiepeng on 2017/7/14.
 */
public interface IVidePathService {

    /***
     * 初始化磁盘文件进库
     * @param videPath
     * @return
     */
    Integer initPath(List<Vide> videPath);

    /***
     * 查询磁盘文件返回前台
     * @param vide
     * @return
     */
    List<Vide> findvidePath(Vide vide);

    Integer findvidePathCount(Vide vide);

    /***
     * 删除失效视频
     * @param vid
     * @return
     */
    Integer delVideoPath(Long vid);

    /***
     * 获取下一视频
     * @param vid
     * @return
     */
    Vide findvideNextPath(Long vid);
}
