package com.team.house.service;

import com.github.pagehelper.PageInfo;
import com.team.house.entity.District;
import com.team.house.util.Page;

import java.util.List;

/**
 * @author 王建兵
 * @Classname DistrictService
 * @Description TODO
 * @Date 2019/8/9 11:15
 * @Created by Administrator
 */
public interface DistrictService {
    /**
     * 查询所有区域
     * @return  区域实体集合
     */
    PageInfo<District> getAllDistrict(Page page);

    /**
     * 添加业务
     * @param district
     * @return
     */

    public int addDistrict(District district);

    /**
     * 查询条信息
     * @param id
     * @return
     */
    public District getDistrict(Integer id);

    /**
     * 修改区域
     * @param district
     * @return  影响行数
     */
    public int updateDistrict(District district);

    /**
     *  删除区域
     * @param 区域编号
     * @return  影响行数
     */
    public int delDistrict(Integer id);


    /**
     *  批量删除区域
     * @param 区域编号
     * @return  影响行数
     */
    public int delMoreDistrict(Integer[] ids);


    /**
     * 查询所有区域
     * @return  区域实体集合
     */
    List<District> getAllDistrict();

}
