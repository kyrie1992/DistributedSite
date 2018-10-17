package cn.cugb.model;

import java.io.Serializable;

/**
 * 学生类
 * Created by nawei on 2018/10/16.
 */
public class Student implements Serializable {

    private static final long serialVersionUID = -8366355128285253238L;
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
