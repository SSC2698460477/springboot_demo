package com.example.demo.biz.service.impl;

import com.example.demo.biz.service.DemoService;
import com.example.demo.dao.mapper.BookInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: demo
 * @description: service接口的实现类
 * @author: ssc
 * @create: 2019/8/18 22:06
 **/
@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    private BookInfoMapper bookInfoMapper;

    @Override
    public String test() {
        return bookInfoMapper.selectById(1).toString();
    }
}
