package com.codewithalcor.fullstack_backend.repository;

import com.codewithalcor.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <User,Long> {

    //jpa bağlantısından sonra application.properties de bir kaç düzenleme yapılması gerekli
}
