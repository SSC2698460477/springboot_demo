package com.example.demo.dao.entity;

/**
 * @program: demo
 * @description: 书籍信息实体类
 * @author: ssc
 * @create: 2019/8/19 10:03
 **/
public class BookInfo {

    private int id; // 主键id

    private String bookName; // 书名

    private String imgUrl; // 封面url

    private String pubInfo; // 出版信息

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
        return pubInfo;
    }

    public void setPubInfo(String pubInfo) {
        this.pubInfo = pubInfo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
