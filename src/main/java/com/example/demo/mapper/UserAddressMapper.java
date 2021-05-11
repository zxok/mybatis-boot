package com.example.demo.mapper;

import com.example.demo.entity.UserAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAddressMapper {

    List<UserAddress> selectUserAddressByUserId(@Param("uid") int uid);

    int insertUserAddress(@Param("address") UserAddress address);
}
