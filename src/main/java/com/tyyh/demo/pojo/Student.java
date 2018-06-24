package com.tyyh.demo.pojo;


import java.sql.Date;
import java.util.Objects;


public class Student {
    private int id;
    private String sname;
    private int sage;
    private Date sbirthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }


    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }


    public Date getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(Date sbirthday) {
        this.sbirthday = sbirthday;
    }
}
