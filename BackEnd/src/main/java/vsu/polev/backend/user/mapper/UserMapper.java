package vsu.polev.backend.user.mapper;

import org.mapstruct.Mapper;
import vsu.polev.backend.user.dto.UserDto;
import vsu.polev.backend.user.dto.UserResponseDto;
import vsu.polev.backend.user.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserDto userDto);

    UserResponseDto toDto(User user);
}
