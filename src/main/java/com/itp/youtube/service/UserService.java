package com.itp.youtube.service;

import com.itp.youtube.Entity.MyUser;
import com.itp.youtube.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Optional<MyUser> getUserById(UUID uuid)  {
        return this.userRepository.findById(uuid);
    }
    public MyUser saveUser(MyUser user1) { return  this.userRepository.save(user1);}

}
