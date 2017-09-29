package com.soecode.lyf.service.impl;


import com.soecode.lyf.dao.VidePathDao;
import com.soecode.lyf.dto.Vide;
import com.soecode.lyf.entity.VidePathEntity;
import com.soecode.lyf.service.IVidePathService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by fengtiepeng on 2017/7/14.
 */
@Transactional
@Service
public class IVidePathServiceImpl implements IVidePathService {


    @Autowired
    private VidePathDao videPathDao;



    public Integer initPath(List<Vide> videPath){
        List<VidePathEntity> videPathEntitys=new LinkedList<>();
        for(Vide videPath1:videPath){
            VidePathEntity videPathEntity=new VidePathEntity();
            BeanUtils.copyProperties(videPath1,videPathEntity);
            videPathEntitys.add(videPathEntity);
        }
        return  videPathDao.initPath(videPathEntitys);
    }

    /***
     * 磁盘文件集合返回
     * @param vide
     * @return
     */
    @Override
    public List<Vide> findvidePath(Vide vide) {
        List<Vide> list=new ArrayList<>();
        VidePathEntity videPathEntity=new VidePathEntity();
        BeanUtils.copyProperties(vide,videPathEntity);
        try{
            List<VidePathEntity> videPathEntityList=videPathDao.findvidePath(videPathEntity);
            for(VidePathEntity videPathEntity1:videPathEntityList){
                Vide vide1=new Vide();
                BeanUtils.copyProperties(videPathEntity1,vide1);
                list.add(vide1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Integer findvidePathCount(Vide vide) {
        VidePathEntity videPathEntity=new VidePathEntity();
        BeanUtils.copyProperties(vide,videPathEntity);
        return videPathDao.findvidePathCount(videPathEntity);
    }


    @Override
    public Integer delVideoPath(Long vid) {
        return videPathDao.delVideoForId(vid);
    };

}
