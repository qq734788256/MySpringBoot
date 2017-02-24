package com.wyl.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by dfsj0317 on 2017/2/24.
 */
@Entity
public class TestUser {
    @Id
    @GeneratedValue
    private long id;//主键.

    private String name;//测试名称

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
