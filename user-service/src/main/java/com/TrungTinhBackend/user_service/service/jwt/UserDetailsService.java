package com.TrungTinhBackend.user_service.service.jwt;

import com.TrungTinhBackend.user_service.entity.User;
import com.TrungTinhBackend.user_service.exception.NotFoundException;
import com.TrungTinhBackend.user_service.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if(user == null) {
            throw new NotFoundException("Không tìm thấy người dùng");
        }

        return user;
    }
}
