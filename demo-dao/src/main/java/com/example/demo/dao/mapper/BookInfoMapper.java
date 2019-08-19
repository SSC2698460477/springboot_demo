package com.example.demo.dao.mapper;

import com.example.demo.dao.entity.BookInfo;

/**
 * @program: demo
 * @description: bookInfo的Mapper接口
 * @author: ssc
 * @create: 2019/8/19 10:10
 **/
public interface BookInfoMapper {

    public BookInfo selectById(Integer id);
}
