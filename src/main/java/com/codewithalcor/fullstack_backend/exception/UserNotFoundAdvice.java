package com.codewithalcor.fullstack_backend.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice //genel hata yönetimi (exception handling) yapmak için kullanılan bir global exception handling mekanizmasıdır.
public class UserNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String> exceptionHandler(UserNotFoundException exception){

        // bu fonksiyon ile exception hatasını postmanda görebildik

        Map<String,String> errorMap = new HashMap<>();

        errorMap.put("errorMessage",exception.getMessage());

        return errorMap;
    }
}
