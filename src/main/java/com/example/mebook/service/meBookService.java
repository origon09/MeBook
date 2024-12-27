package com.example.mebook.service;

import com.example.mebook.domain.MeBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class meBookService implements MeBook {

    public List<String> homeApiCall(String username) {

        List<String> homeApiLinks = new ArrayList<>();
        homeApiLinks.add("testLink");
        return homeApiLinks;
    }
}
