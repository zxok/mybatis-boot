package com.example.demo;

import com.example.demo.entity.UserAddress;
import com.example.demo.mapper.UserAddressMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;

/**
 * @program: day2-mybatis
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2020-10-27 19:43
 **/
public class TestMinHomework {

    SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(
            TestMinHomework.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
    );
    SqlSession sqlSession = ssf.openSession(true);

    @Test
    public void selectUserAddressByUserIdTest() {
        UserAddressMapper addressMapper = sqlSession.getMapper(UserAddressMapper.class);
        List<UserAddress> userAddressList = addressMapper.selectUserAddressByUserId(1);
        System.out.println(userAddressList);
    }

    @Test
    public void insertUserAddressTest() {
        UserAddressMapper addressMapper = sqlSession.getMapper(UserAddressMapper.class);
        UserAddress userAddress = new UserAddress(
                1,"咖啡","18378166669","广西","南宁","江南区","233号");
        int insert = addressMapper.insertUserAddress(userAddress);
        System.out.println(insert);
    }

}
