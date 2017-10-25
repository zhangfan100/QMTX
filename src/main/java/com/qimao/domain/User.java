package com.qimao.domain;

import java.io.Serializable;

/**
 * web-api
 *
 * @author zhangfan
 * @date 2017/10/25 18:54
 * @function
 */
public class User implements Serializable{
    private int id;
    private String name;
    private String addr;

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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
