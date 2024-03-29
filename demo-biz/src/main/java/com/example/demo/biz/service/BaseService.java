package com.example.demo.biz.service;

import com.example.demo.dao.entity.BaseEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * @program: demo
 * @description: 基础的service，封装一些通用的方法
 * @author: ssc
 * @create: 2019/8/20 10:34
 **/
public abstract class BaseService <T extends BaseEntity>{

//    @Autowired
//    private Mapper<T> mapper;
//
//    public abstract Mapper<T> getMapper();
//
//    /**
//     * 根据id查询数据
//     *
//     * @param id
//     * @return
//     */
//    public T queryById(Integer id){
//        return this.mapper.selectByPrimaryKey(id);
//    }
//
//    /**
//     * 查询所有的数据
//     *
//     * @return
//     */
//    public List<T> queryAll(){
//        return this.mapper.select(null);
//    }
//
//    /**
//     * 根据条件 查询一条数据 如果查询 结果是多条数据 会抛出异常
//     *
//     * @param record
//     * @return
//     */
//    public T queryOne(T record){
//        return this.mapper.selectOne(record);
//    }
//
//    /**
//     * 根据条件查询多条数据
//     *
//     * @param record
//     * @return
//     */
//    public List<T> queryListByWhere(T record){
//        return this.mapper.select(record);
//    }
//
//    /**
//     * 根据条件分页查询数据
//     *
//     * @param record
//     * @param page
//     * @param rows
//     * @return
//     */
//    public PageInfo<T> queryPageListByWhere(T record, Integer page, Integer rows){
//
//        //设置分页参数
//        PageHelper.startPage(page, rows);
//        List<T> list = this.mapper.select(record);
//        return new PageInfo<T>(list);
//    }
//
//    /**
//     * 新增数据
//     *
//     * @param t
//     * @return
//     */
//    public Integer save(T t){
//        t.setCreated(new Date());
//        t.setUpdated(t.getCreated());
//        return this.mapper.insert(t);
//    }
//
//    /**
//     * 选择不为null的字段作为插入数据的字段来插入数据
//     *
//     * @param t
//     * @return
//     */
//    public Integer saveSelective(T t){
//        t.setCreated(new Date());
//        t.setUpdated(t.getCreated());
//        return this.mapper.insertSelective(t);
//    }
//
//    /**
//     * 更新数据
//     *
//     * @param t
//     * @return
//     */
//    public Integer update(T t){
//        t.setUpdated(new Date());
//        return this.mapper.updateByPrimaryKey(t);
//    }
//
//    /**
//     * 选择不为null的字段作为更新数据的字段来更新数据
//     *
//     * @param t
//     * @return
//     */
//    public Integer updateSelective(T t){
//        t.setUpdated(new Date());
//        t.setCreated(null); //强制设置创建时间为null 永远不会被更新
//        return this.mapper.updateByPrimaryKeySelective(t);
//    }
//
//    /**
//     * 根据id删除数据（物理删除）
//     *
//     * @param id
//     * @return
//     */
//    public Integer deleteById(Long id){
//        return this.mapper.deleteByPrimaryKey(id);
//    }
//
//    /**
//     * 批量删除时数据
//     *
//     * @param ids
//     * @param clazz
//     * @param property
//     * @return
//     */
//    public Integer deleteByIds(List<Object> ids, Class<T> clazz, String property){
//        Example example = new Example(clazz);
//        //设置条件
//        example.createCriteria().andIn(property, ids);
//        return this.mapper.deleteByExample(example);
//    }
//
//    /**
//     * 根据条件来删除数据
//     *
//     * @param record
//     * @return
//     */
//    public Integer deleteByWhere(T record){
//        return this.mapper.delete(record);
//    }

    public abstract Mapper<T> getMapper();

    /**
     * 根据id查询数据
     *
     * @param id
     * @return
     */
    public T queryById(Integer id){
        return this.getMapper().selectByPrimaryKey(id);
    }

    /**
     * 查询所有的数据
     *
     * @return
     */
    public List<T> queryAll(){
        return this.getMapper().select(null);
    }

    /**
     * 根据条件 查询一条数据 如果查询 结果是多条数据 会抛出异常
     *
     * @param record
     * @return
     */
    public T queryOne(T record){
        return this.getMapper().selectOne(record);
    }

    /**
     * 根据条件查询多条数据
     *
     * @param record
     * @return
     */
    public List<T> queryListByWhere(T record){
        return this.getMapper().select(record);
    }

    /**
     * 根据条件分页查询数据
     *
     * @param record
     * @param page
     * @param rows
     * @return
     */
    public PageInfo<T> queryPageListByWhere(T record, Integer page, Integer rows){

        //设置分页参数
        PageHelper.startPage(page, rows);
        List<T> list = this.getMapper().select(record);
        return new PageInfo<T>(list);
    }

    /**
     * 新增数据
     *
     * @param t
     * @return
     */
    public Integer save(T t){
        t.setCreated(new Date());
        t.setUpdated(t.getCreated());
        return this.getMapper().insert(t);
    }

    /**
     * 选择不为null的字段作为插入数据的字段来插入数据
     *
     * @param t
     * @return
     */
    public Integer saveSelective(T t){
        t.setCreated(new Date());
        t.setUpdated(t.getCreated());
        return this.getMapper().insertSelective(t);
    }

    /**
     * 更新数据
     *
     * @param t
     * @return
     */
    public Integer update(T t){
        t.setUpdated(new Date());
        return this.getMapper().updateByPrimaryKey(t);
    }

    /**
     * 选择不为null的字段作为更新数据的字段来更新数据
     *
     * @param t
     * @return
     */
    public Integer updateSelective(T t){
        t.setUpdated(new Date());
        t.setCreated(null); //强制设置创建时间为null 永远不会被更新
        return this.getMapper().updateByPrimaryKeySelective(t);
    }

    /**
     * 根据id删除数据（物理删除）
     *
     * @param id
     * @return
     */
    public Integer deleteById(Long id){
        return this.getMapper().deleteByPrimaryKey(id);
    }

    /**
     * 批量删除时数据
     *
     * @param ids
     * @param clazz
     * @param property
     * @return
     */
    public Integer deleteByIds(List<Object> ids, Class<T> clazz, String property){
        Example example = new Example(clazz);
        //设置条件
        example.createCriteria().andIn(property, ids);
        return this.getMapper().deleteByExample(example);
    }

    /**
     * 根据条件来删除数据
     *
     * @param record
     * @return
     */
    public Integer deleteByWhere(T record){
        return this.getMapper().delete(record);
    }
}
