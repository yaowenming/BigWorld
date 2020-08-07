package com.bigworld.springmvc.tree;

import com.bigworld.springmvc.datadefine.Content;

/**
 * @author ：ywm
 * @date ：Created in 2020/8/7 16:29
 * @description：
 * @modified By：
 * @version: $
 */
public class Persion implements Content {
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

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public String printSelf() {
        return this.toString();
    }
}
