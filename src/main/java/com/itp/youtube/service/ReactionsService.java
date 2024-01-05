package com.itp.youtube.service;

import com.itp.youtube.Repository.UserReactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ReactionsService {

    private final UserReactionRepository userReactionRepository;
}
