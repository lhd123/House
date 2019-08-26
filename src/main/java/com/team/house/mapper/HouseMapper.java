package com.team.house.mapper;

import com.team.house.entity.House;
import com.team.house.entity.HouseExample;
import com.team.house.util.HouseCondition;

import java.util.List;

public interface HouseMapper {
    int deleteByPrimaryKey(String id);

    int insert(House record);

    int insertSelective(House record);

    List<House> selectByExample(HouseExample example);

    House selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
    public List<House> getHouseByUser(Integer userid);

    //查询出租房信息
    public House getHouseById(String id);
    //查询所以出租房未审核出租房信息
    public List<House> getHouseByIsPass(Integer ispass);
    //浏览出租房信息
    public List<House> getHouseBySearch(HouseCondition condition);
}