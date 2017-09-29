package com.soecode.lyf.dto;

/**
 * Created by fengtiepeng on 2017/7/21.
 */
public class Disk {
    private String diskLable;
    private String diskName;

    public Disk() {
    }

    public String getDiskLable() {
        return diskLable;
    }

    public void setDiskLable(String diskLable) {
        this.diskLable = diskLable;
    }

    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public Disk(String diskLable, String diskName) {
        this.diskLable = diskLable;
        this.diskName = diskName;
    }
}
