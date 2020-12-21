package com.zq.bean;/**
 * @Author: YourName
 * @Date: Created in 2020/11/7 20:01
 * @Description: TODO
 * @Version: 1.0
 */

/**
 *@author LZQ
 *@date 2020/11/7 20:01
 */
public class User {
    private String name;
    private String password;
    private String lockState;


    public String getLockState() {
        return lockState;
    }

    public void setLockState(String lockState) {
        this.lockState = lockState;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
