package com.example.demo.mapper;

import com.example.demo.entity.Roles;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolesMapper {

    Roles selectByUserId(@Param("uid") int userId);

    List<Roles> selectListByUserId(@Param("uid") int userId);
}
