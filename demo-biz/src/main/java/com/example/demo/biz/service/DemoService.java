package com.example.demo.biz.service;

import com.example.demo.dao.entity.BookInfo;
import com.example.demo.dao.mapper.BookInfoMapper;

import javax.annotation.Resource;

/**
 * @program: demo
 * @description: service层服务接口
 * @author: ssc
 * @create: 2019年8月18日 22:05:05
 **/
public class DemoService extends BaseService<BookInfo>{

    @Resource
    private BookInfoMapper bookInfoMapper;

    public String test() {
        return bookInfoMapper.selectById(1).toString();
    }

    public BookInfo queryBookById(Integer id) {
        return bookInfoMapper.selectById(id);
    }
}
