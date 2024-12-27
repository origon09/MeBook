package com.example.mebook.exceptions;

public class BadIDTokenException extends RuntimeException{
    public BadIDTokenException(String msg) {
        super(msg);
    }
}
