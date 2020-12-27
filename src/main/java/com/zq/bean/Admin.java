package com.zq.bean;

import java.io.Serializable;

/**
 * @author HYN
 * @create 2020/12/26
 **/
public class Admin implements Serializable {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

