package com.team.house.service;


import com.github.pagehelper.PageInfo;
import com.team.house.entity.Street;
import com.team.house.util.Page;

import java.util.List;

/**
 * @author 王建兵
 * @Classname StreetService
 * @Description TODO
 * @Date 2019/8/13 9:29
 * @Created by Administrator
 */
public interface StreetService {
    /**
     * //通过区域查询对应街道
     * @param did  区域编号
     * @return
     */
    public PageInfo<Street> getStreetByDistrict(Integer did, Page page);

    /**
     * //通过区域查询对应街道
     * @param did  区域编号
     * @return
     */
    public List<Street> getStreetByDistrict(Integer did);
}
