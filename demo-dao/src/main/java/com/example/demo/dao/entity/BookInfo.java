package com.example.demo.dao.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: demo
 * @description: 书籍信息实体类
 * @author: ssc
 * @create: 2019/8/19 10:03
 **/
@Table(name = "tb_book_info")
public class BookInfo extends BaseEntity{

    @Id
    private int id; // 主键id

    @Column(name = "book_name")
    private String bookName; // 书名

    @Column(name = "img_url")
    private String imgUrl; // 封面url

    @Column(name = "publish_info")
    private String publishInfo; // 出版信息

    @Column(name = "content")
    private String content; // 书籍简介

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getPubInfo() {
        return publishInfo;
    }

    public void setPubInfo(String publishInfo) {
        this.publishInfo = publishInfo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
