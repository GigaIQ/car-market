package vsu.polev.backend.user.dto;

import lombok.Data;

@Data
public class UserDto {
    private String login;
    private String name;
    private String password;
}
