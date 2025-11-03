package com.TrungTinhBackend.user_service.service.user;

import com.TrungTinhBackend.user_service.dto.APIResponse;
import com.TrungTinhBackend.user_service.dto.RegisterDto;

public interface UserService {
    APIResponse register(RegisterDto registerDto);
    APIResponse getAllUser();
}
