package com.example.demo.mapper;

import com.example.demo.entities.RoleUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleUserMapper {
    List<RoleUser> getAllRoleUser();
}
