package com.example.demo.mapper;

import com.example.demo.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {

    Order selectByNo(@Param("no") int no);

    List<Order> selectByUserIdList(@Param("uid") int uid);

}
