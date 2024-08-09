package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查对应的套餐id
     * @param dishIds
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
