package com.itp.youtube.service;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class VideoChannelService {

    public boolean getChannelById(String id){
        return Objects.equals(id, "26");
    }
}
