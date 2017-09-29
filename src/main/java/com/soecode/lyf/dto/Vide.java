package com.soecode.lyf.dto;

import java.net.UnknownHostException;

/**
 * Created by fengtiepeng on 2017/7/14.
 */
public class Vide {

    private Long id;
    private String  name;
    private String type;
    private String filePath;
    private String fileIp;
    private String imageUri;
    private Integer pageNo;
    private Integer pageSize;

    public String getImageUri() {
        return fileIp+":8081/"+filePath.replace("\\","/");
    }


    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Vide(String name, String type, String filePath, String fileIp) {
        this.name = name;
        this.type = type;
        this.filePath = filePath;
        this.fileIp = fileIp;
    }

    public String getFileIp()throws UnknownHostException {

        return fileIp;
    }

    public void setFileIp(String fileIp) {
        this.fileIp = fileIp;
    }

    public Vide(String name, String type, String filePath) {
        this.name = name;
        this.type = type;
        this.filePath = filePath;
    }

    public Vide(Long id, String name, String type, String filePath, String fileIp) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.filePath = filePath;
        this.fileIp = fileIp;
    }

    public Vide() {


    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Vide(String name,String type) {
        this.name = name;
        this.type = type;
    }

    public Vide(String name, String type, Integer pageNo, Integer pageSize) {
        this.name = name;
        this.type = type;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public Vide(Long id) {
        this.id = id;
    }
}
