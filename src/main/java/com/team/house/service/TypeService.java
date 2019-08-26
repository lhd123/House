package com.team.house.service;

import com.github.pagehelper.PageInfo;
import com.team.house.entity.Type;
import com.team.house.util.Page;

import java.util.List;

/**
 * @author 王建兵
 * @Classname TypeService
 * @Description TODO
 * @Date 2019/8/9 11:15
 * @Created by Administrator
 */
public interface TypeService {
    /**
     * 查询所有区域
     * @return  区域实体集合
     */
    PageInfo<Type> getAllType(Page page);

    /**
     * 添加业务
     * @param Type
     * @return
     */

    public int addType(Type Type);

    /**
     * 查询条信息
     * @param id
     * @return
     */
    public Type getType(Integer id);

    /**
     * 修改区域
     * @param Type
     * @return  影响行数
     */
    public int updateType(Type Type);

    /**
     *  删除区域
     * @param 区域编号
     * @return  影响行数
     */
    public int delType(Integer id);


    /**
     *  批量删除区域
     * @param 区域编号
     * @return  影响行数
     */
    public int delMoreType(Integer[] ids);


    /**
     * 查询所有类型
     * @return
     */
    public List<Type> getAllType();

}
