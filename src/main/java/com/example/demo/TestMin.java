package com.example.demo;



import com.example.demo.entity.Order;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.example.demo.entity.Roles;
import com.example.demo.mapper.OrderMapper;
import com.example.demo.mapper.RolesMapper;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @program: day2-mybatis
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2020-10-27 19:43
 **/
public class TestMin {

    SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(
            TestMin.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
    );
    SqlSession sqlSession = ssf.openSession(true);

    @Test
    public void selectByOrderNoTest() {
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        Order order = orderMapper.selectByNo(10001);
        System.out.println(order);
    }

    @Test
    public void selectByUserIdTest() {
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orders = orderMapper.selectByUserIdList(1);
        System.out.println(orders);
    }

    //多对多
    @Test
    public void selectByUserIdTest2() {
        RolesMapper rolesMapper = sqlSession.getMapper(RolesMapper.class);
        Roles roles = rolesMapper.selectByUserId(1);
        System.out.println(roles);
    }
    @Test
    public void selectListByUserIdTest2() {
        RolesMapper rolesMapper = sqlSession.getMapper(RolesMapper.class);
        List<Roles> rolesList = rolesMapper.selectListByUserId(1);
        System.out.println(rolesList);
    }

}
