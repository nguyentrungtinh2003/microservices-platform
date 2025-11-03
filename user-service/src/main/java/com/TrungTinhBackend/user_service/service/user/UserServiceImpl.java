package com.TrungTinhBackend.user_service.service.user;

import com.TrungTinhBackend.user_service.dto.APIResponse;
import com.TrungTinhBackend.user_service.dto.RegisterDto;
import com.TrungTinhBackend.user_service.entity.User;
import com.TrungTinhBackend.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public APIResponse register(RegisterDto registerDto) {
        APIResponse apiResponse = new APIResponse();

        User user = new User();
        user.setUsername(registerDto.getUsername());
        user.setPassword(registerDto.getPassword());
        user.setEmail(registerDto.getEmail());
        user.setPhone(registerDto.getPhone());
        user.setImg(registerDto.getImg());
        user.setBirthday(registerDto.getBirthday());
        user.setAddress(registerDto.getAddress());
        user.setPosition(registerDto.getPosition());
        user.setRole(registerDto.getRole());
        user.setDeleted(false);

        userRepository.save(user);

        apiResponse.setStatusCode(200L);
        apiResponse.setMessage("Register success");
        apiResponse.setTimestamp(LocalDateTime.now());

        return apiResponse;
    }

    @Override
    public APIResponse getAllUser() {
        return null;
    }
}
