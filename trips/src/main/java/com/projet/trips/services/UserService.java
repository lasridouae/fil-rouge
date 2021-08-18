package com.projet.trips.services;

import java.util.List;

import com.projet.trips.Dto.UserDto;


public interface UserService {
    UserDto createUser(UserDto userDto);
    List<UserDto> getUsers(int page, int limit);
    UserDto getUserByUserId(String userId);
    UserDto updateUser(String username, UserDto userDto);
    void deleteUser(String username);
    UserDto updateUserAccount(String username, UserDto userDto);
}
