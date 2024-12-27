package com.example.mebook.controller;

import com.example.mebook.domain.MeBook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class meBookController {

    @Autowired
    private MeBook meBook;

    Logger log = LoggerFactory.getLogger(meBookController.class);

    public meBookController(MeBook meBook) {
        this.meBook = meBook;
    }

    @GetMapping("/home")
    public List<String> HomeApi(@RequestHeader String Authorization, @RequestParam String username){
//        boolean isTokenValid = true;
//        if(isTokenValid) {
            return meBook.homeApiCall(username);
        }
//        else{
//            log.info("HomeApi Link Retrieval Error");
//             return null;
//            throw new BadIDTokenExcetpion(MeBookConstants.BAD_TOKEN_EXCEPTION);
        }
//    }
//}
