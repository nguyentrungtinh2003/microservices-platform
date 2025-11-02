package com.TrungTinhBackend.user_service.dto;

import com.TrungTinhBackend.user_service.enums.Role;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserDto {
    private Long id;
    private String username;
    private String email;
    private String phone;
    private String address;

    private LocalDate birthday;
    private String img;
    private String position;
    private Role role;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private boolean deleted;

    public UserDto() {
    }

    public UserDto(Long id, String username, String email, String phone, String address, LocalDate birthday, String img, String position, Role role, LocalDateTime createdAt, LocalDateTime updateAt, boolean deleted) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.address = address;

        this.birthday = birthday;
        this.img = img;
        this.position = position;
        this.role = role;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.deleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
