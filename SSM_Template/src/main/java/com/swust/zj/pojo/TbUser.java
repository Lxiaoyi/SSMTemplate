package com.swust.zj.pojo;

public class TbUser {
    private Integer id;

    private String name;

    public TbUser(){
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}