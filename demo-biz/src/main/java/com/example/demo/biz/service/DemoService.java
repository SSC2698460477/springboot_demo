package com.example.demo.biz.service;

import com.example.demo.dao.entity.BookInfo;

/**
 * @program: demo
 * @description: service层服务接口
 * @author: ssc
 * @create: 2019年8月18日 22:05:05
 **/
public interface DemoService {

    public String test();

    /**
     * 通过id 来查询书籍信息
     *
     * @param id
     * @return
     */
    BookInfo queryBookById(Integer id);
}
