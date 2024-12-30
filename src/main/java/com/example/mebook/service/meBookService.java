package com.example.mebook.service;

import com.example.mebook.domain.MeBook;
import com.example.mebook.model.Users;
import com.example.mebook.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class meBookService implements MeBook {

    private final UsersRepository usersRepository;

    public meBookService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<String> homeApiCall(String username) {

        List<String> homeApiLinks = new ArrayList<>();
        homeApiLinks.add("testLink");
        return homeApiLinks;
    }


    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

    @Override
    public void addUser(Users user) {
        usersRepository.save(user);
    }
}
