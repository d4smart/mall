package com.mall.dao;

import com.mall.pojo.OrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);

    List<OrderItem> getByOrderNumberUserId(@Param("orderNumber") Long orderNumber, @Param("userId") Integer userId);

    List<OrderItem> getByOrderNumber(Long orderNumber);

    void batchInsert(@Param("orderItemList") List<OrderItem> orderItemList);
}