package com.example.demo.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @program: demo
 * @description: 基础的mapper
 * @author: ssc
 * @create: 2019/8/20 10:21
 **/
public interface BaseMapper<T> extends Mapper<T>,MySqlMapper<T>{

}
