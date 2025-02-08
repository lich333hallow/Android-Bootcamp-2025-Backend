package com.example.bootcamp.dto;

import com.example.bootcamp.entity.Contact;
import com.example.bootcamp.entity.Organization;
import lombok.Data;

@Data
public class UserDTO {
    private long id;
    private String name;
    private String secondName;
    private String lastName;
    private String photoUrl;
    private String username;
    private String organizationName;
    private String phoneNumber;
    private String email;
    private String telegramLink;
    private String info;
}
