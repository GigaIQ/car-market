package vsu.polev.backend.user.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vsu.polev.backend.user.dto.UserDto;
import vsu.polev.backend.user.dto.UserResponseDto;
import vsu.polev.backend.user.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user-controller")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserResponseDto> register(@RequestBody UserDto requestDto) {
        return ResponseEntity.ok(userService.register(requestDto));
    }

    @GetMapping("/get-users")
    public ResponseEntity<List<UserResponseDto>> findAll() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }
}
