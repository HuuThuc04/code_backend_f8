package com.example.demo.service.UserServiceImpl;

import com.example.demo.entities.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService2Impl implements UserService2 {

    @Autowired
    UserMapper mapper;

    @Override
    public List<User> getAllUser(){
//        User user01 = User.builder()
//                            .userId(1)
//                            .userName("Huu Thuc")
//                            .age(18).description("")
//                            .gmail("huynhhuuthuc321@gmail.com")
//                            .build();
//
//        User user02 = User.builder()
//                .userId(2)
//                .userName("Quốc Đạt")
//                .age(23)
//                .gmail("datbui185@gmail.com")
//                .description("Mentor F8")
//                .build();
//        User user03 = User.builder()
//                .userId(3)
//                .userName("Quynh")
//                .age(19)
//                .gmail("quynh209@gmail.com")
//                .description("F8")
//                .build();
//        User user04 = User.builder()
//                .userId(4)
//                .userName("Nguyễn Huy")
//                .age(22)
//                .gmail("nguyenhuy96877@gmail.com")
//                .description("1")
//                .build();
//        User user05 = User.builder()
//                .userId(05)
//                .userName("Nam")
//                .age(19)
//                .gmail("minhnam1810@gmail.com")
//                .description(".")
//                .build();
        List<User> listUser = mapper.getAllUser();
        return listUser;
    }

}
