package com.TrungTinhBackend.user_service.service;

import com.TrungTinhBackend.user_service.dto.ApiResponse;
import com.TrungTinhBackend.user_service.dto.RegisterDto;

public interface UserService {
    ApiResponse register(RegisterDto registerDto);
    ApiResponse getAllUser();
}
