package com.example.demo.controller;

import com.example.demo.entity.Order;
import com.example.demo.mapper.OrderMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: mybatis-boot
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2021-05-10 09:47
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    OrderMapper orderMapper;

    @GetMapping("/getOrderList")
    List<Order> selectByUserIdList(@Param("uid") int uid) {
        return orderMapper.selectByUserIdList(uid);
    }

}
