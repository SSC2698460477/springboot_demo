package com.example.demo.biz.service.impl;

import com.example.demo.biz.service.DemoService;
import com.example.demo.dao.entity.BookInfo;
import com.example.demo.dao.mapper.BookInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: demo
 * @description: service接口的实现类 这个类暂时没有用途了，这个service接口的设计还是不能两全其美，不知道如何
 *                  实现两者兼得
 * @author: ssc
 * @create: 2019/8/18 22:06
 **/
@Service
public class DemoServiceImpl extends DemoService {

    @Resource
    private BookInfoMapper bookInfoMapper;

    @Override
    public String test() {
        return bookInfoMapper.selectById(1).toString();
    }

    @Override
    public BookInfo queryBookById(Integer id) {
        return bookInfoMapper.selectById(id);
    }

}
