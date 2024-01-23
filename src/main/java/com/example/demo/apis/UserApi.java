package com.example.demo.apis;

import com.example.demo.entities.User;
import com.example.demo.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserApi {

    @Autowired
    UserService2 userService2;

    @GetMapping("/getAllUser")
    public ResponseEntity<?> getAllUsers(){
//        User user01 = new User();
//        user01.setUserId(1);
//        user01.setUserName("Hữu Thức");
//        return ResponseEntity.ok(user01);

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
//            List<User> listUser = Arrays.asList(user01,user02,user03,user04,user05);
        return ResponseEntity.ok(userService2);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable("id") Long id ){
        System.out.println(id);
        return null;
    }



}
