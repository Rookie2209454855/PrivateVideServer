package com.soecode.lyf.dao;


import com.soecode.lyf.entity.VidePathEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by fengtiepeng on 2017/7/14.
 */
public interface VidePathDao {

    /***
     * 初始化视频路径
     * @param videPathEntitys
     * @return
     */
    Integer initPath(@Param("videPaths") List<VidePathEntity> videPathEntitys);

    List<VidePathEntity> findvidePath(@Param("videPaths")VidePathEntity videPathEntitys);

    Integer findvidePathCount(@Param("videPaths")VidePathEntity videPathEntitys);
    /**
     * 删除根据视频id
     * @param vid
     * @return
     */
    Integer delVideoForId(@Param("vid") Long vid);
}
