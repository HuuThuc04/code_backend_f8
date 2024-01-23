package com.example.demo.entities;

import lombok.*;

//@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {

    private long userId;
    private String userName;
    private long age;
    private String gmail;
    private String description;
    private long roleId;
}
