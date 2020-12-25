package com.zq.bean;/**
 * @Author: YourName
 * @Date: Created in 2020/12/22 21:51
 * @Description: TODO
 * @Version: 1.0
 */

/**
 *@author LZQ
 *@date 2020/12/22 21:51
 */
public class GoodsCar {
    private int id;

    private String name;

    private String path;

    private String date;

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
