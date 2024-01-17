package com.itp.youtube.service;

import com.itp.youtube.Entity.MyUser;
import com.itp.youtube.Repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {


    private final UserRepository userRepository;

    @Autowired // Use @Autowired for injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public Optional<MyUser> getUserById(UUID uuid)  {
        return this.userRepository.findById(uuid);
    }
    public MyUser saveUser(MyUser user1) { return  this.userRepository.save(user1);}

}
