package com.zq.bean;/**
 * @Author: YourName
 * @Date: Created in 2020/12/24 19:03
 * @Description: TODO
 * @Version: 1.0
 */

/**
 *@author LZQ
 *@date 2020/12/24 19:03
 */
public class OwnBicycle {
    private int id;
    private String path;
    private String owner;
    private String time;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
