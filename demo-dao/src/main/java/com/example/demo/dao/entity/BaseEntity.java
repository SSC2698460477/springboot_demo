package com.example.demo.dao.entity;

import java.util.Date;

/**
 * @program: demo
 * @description: 基础的实体类，封装一些共有的属性，例如修改时间 、创建时间
 * @author: ssc
 * @create: 2019/8/20 10:36
 **/
public abstract class BaseEntity {

    private Date created; // 创建时间
    private Date updated; // 修改时间

    public Date getCreated() {
        return created;
    }
    public void setCreated(Date created) {
        this.created = created;
    }
    public Date getUpdated() {
        return updated;
    }
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
