package com.example.mebook.domain;

import com.example.mebook.model.Users;

import java.util.List;

public interface MeBook {

    public List<String> homeApiCall(String username);

    public List<Users> getUsers();

    void addUser(Users user);
}
