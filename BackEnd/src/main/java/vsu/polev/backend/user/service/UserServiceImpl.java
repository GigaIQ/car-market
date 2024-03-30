package vsu.polev.backend.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vsu.polev.backend.user.dto.UserDto;
import vsu.polev.backend.user.dto.UserResponseDto;
import vsu.polev.backend.user.mapper.UserMapper;
import vsu.polev.backend.user.model.User;
import vsu.polev.backend.user.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    @Override
    public UserResponseDto register(UserDto userDto) {
    //рега
        User createdUser = userMapper.toEntity(userDto);
//        createdUser.setPassword(passwordEncoder.encode(createdUser.getPassword()));
        User newUser = userRepository.save(createdUser);

        return new UserResponseDto(newUser.getId(), userDto.getName(), userDto.getLogin(), userDto.getPassword());
    }

    @Override
    public List<UserResponseDto> findAll() {
        return userRepository.findAll().stream()
                .map(userMapper::toDto)
                .toList();
    }
}
