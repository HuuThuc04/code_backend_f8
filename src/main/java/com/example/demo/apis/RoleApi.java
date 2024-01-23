package com.example.demo.apis;

import com.example.demo.service.RoleUserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/roleUsers")
public class RoleApi {

   @Autowired
   RoleUserSevice roleUserSevice;

    @GetMapping("/getAllRoleUsers")
    public ResponseEntity<?> getAllRoleUsers(){
        return ResponseEntity.ok(roleUserSevice.getAllRoleUser());
    };

}
