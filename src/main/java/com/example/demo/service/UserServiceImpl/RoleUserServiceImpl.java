package com.example.demo.service.UserServiceImpl;

import com.example.demo.entities.RoleUser;
import com.example.demo.mapper.RoleUserMapper;
import com.example.demo.service.RoleUserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleUserServiceImpl implements RoleUserSevice {
    @Autowired
    RoleUserMapper mapper;

    @Override
    public List<RoleUser> getAllRoleUser(){
        List<RoleUser> listRoleUser = mapper.getAllRoleUser();
                return listRoleUser;
    }


}
