package com.example.demo.web.controller;

import com.example.demo.biz.service.DemoService;
import com.example.demo.dao.entity.BookInfo;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: demo
 * @description: demo项目的controller类
 * @author: ssc
 * @create: 2019/8/18
 **/
@RestController
@RequestMapping("demo")
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("test")
    public String test(){
        return demoService.test();
    }

    // 根据id 查询书籍信息
    @GetMapping("queryBookById/{id}")
    public BookInfo queryBookById(@PathVariable("id") Integer id){
        return demoService.queryBookById(id);
    }

    // 分页查询book列表信息
    @GetMapping("queryBookList")
    public List<BookInfo> queryBookList(){
        PageInfo<BookInfo> pageInfo = demoService.queryPageListByWhere(null,1,20);
        return pageInfo.getList();
    }
}
