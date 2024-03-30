package vsu.polev.backend.user.service;

import vsu.polev.backend.user.dto.UserDto;
import vsu.polev.backend.user.dto.UserResponseDto;

import java.util.List;

public interface UserService {
    UserResponseDto register (UserDto userDto);
    List<UserResponseDto> findAll();
}
