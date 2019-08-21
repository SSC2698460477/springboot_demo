package com.example.demo.biz.service;

import com.example.demo.dao.entity.BookInfo;
import com.example.demo.dao.mapper.BookMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;

/**
 * @program: demo
 * @description: 书籍的service服务类
 * @author: ssc
 * @create: 2019/8/21 15:37
 **/
@Service
public class BookService extends BaseService<BookInfo> {

    private Logger logger = LoggerFactory.getLogger(BookService.class);

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Mapper<BookInfo> getMapper() {
        return bookMapper;
    }
}
