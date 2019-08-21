package com.example.demo.biz.service;

import com.example.demo.dao.entity.BookInfo;
import com.example.demo.dao.mapper.BookInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;

/**
 * @program: demo
 * @description: service层服务接口
 * @author: ssc
 * @create: 2019年8月18日 22:05:05
 **/
@Service
public class DemoService extends BaseService<BookInfo>{

    @Autowired
    private BookInfoMapper bookInfoMapper;

    public String test() {
        return bookInfoMapper.selectById(1).toString();
    }

    public BookInfo queryBookById(Integer id) {
        return bookInfoMapper.selectById(id);
    }

    @Override
    public Mapper<BookInfo> getMapper() {
        return bookInfoMapper;
    }
}
