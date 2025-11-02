package com.TrungTinhBackend.user_service.dto;
import com.TrungTinhBackend.user_service.enums.Role;
import java.time.LocalDate;

public class RegisterDto {

    private String username;
    private String email;
    private String phone;
    private String address;
    private String password;
    private LocalDate birthday;
    private String img;
    private String position;
    private Role role;


    public RegisterDto() {
    }

    public RegisterDto( String username, String email, String phone, String address, String password, LocalDate birthday, String img, String position, Role role) {

        this.username = username;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.password = password;
        this.birthday = birthday;
        this.img = img;
        this.position = position;
        this.role = role;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

}
