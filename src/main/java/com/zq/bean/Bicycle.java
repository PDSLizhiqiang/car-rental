package com.zq.bean;/**
 * @Author: YourName
 * @Date: Created in 2020/11/22 17:26
 * @Description: TODO
 * @Version: 1.0
 */

/**
 *@author LZQ
 *@date 2020/11/22 17:26
 */
public class Bicycle {
    private int id;
    private String description;
    private String path;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", path='" + path + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
