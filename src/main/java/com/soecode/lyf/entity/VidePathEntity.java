package com.soecode.lyf.entity;

/**
 * Created by fengtiepeng on 2017/7/14.
 */
public class VidePathEntity {

    private Long id;
    private String  name;
    private String type;
    private String filePath;
    private String fileIp;

    private Integer pageNo;
    private Integer pageSize;

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

    public VidePathEntity(Long id, String name, String type, String filePath, String fileIp) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.filePath = filePath;
        this.fileIp = fileIp;
    }

    public String getFileIp() {

        return fileIp;
    }

    public void setFileIp(String fileIp) {
        this.fileIp = fileIp;
    }

    public VidePathEntity(String name, String type, String filePath) {
        this.name = name;
        this.type = type;
        this.filePath = filePath;
    }

    public VidePathEntity() {

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
}
