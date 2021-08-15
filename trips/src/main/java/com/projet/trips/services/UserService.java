package com.projet.trips.services;

import java.util.List;

import com.projet.trips.Dto.UserDto;


public interface UserService {
    UserDto createUser(UserDto userDto);
    List<UserDto> getUsers(int page, int limit);
    UserDto getUserByUserId(String userId);
    UserDto updateUser(String userId, UserDto userDto);
    void deleteUser(String userId);
    UserDto updateUserAccount(String userId, UserDto userDto);
}
