package com.project.Health_BE.Dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestDto {
    private String customId;
    private String password;
}
