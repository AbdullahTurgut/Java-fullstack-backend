package com.codewithalcor.fullstack_backend.exception;

// hata atıcaz bu yüzden RunTimeException sınıfından kalıtım al- extends
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id){
        super("Could not found the user with id " + id);
    }
}
