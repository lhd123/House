package com.team.house.service;

import com.github.pagehelper.PageInfo;
import com.team.house.entity.House;
import com.team.house.util.HouseCondition;
import com.team.house.util.Page;

/**
 * @author 王建兵
 * @Classname HouseService
 * @Description TODO
 * @Date 2019/8/16 10:41
 * @Created by Administrator
 */
public interface HouseService {
    //发布出租房信息
    public int addHouse(House house);

    public PageInfo<House> getHouseByUser(Page page, Integer userid);

    public House getHouse(String id);

    public int updateHouse(House house);

    //修改出租房状态
    public int delHouseState(String id,Integer state);
    //通过审核状态查询 出租房信息
    public PageInfo<House> getHouseByIsPass(Page page,Integer state);
    //取消审核状态
    public int PassHouse(String id,Integer state);

    public PageInfo<House> getHouseBySearch(HouseCondition condition);
}
