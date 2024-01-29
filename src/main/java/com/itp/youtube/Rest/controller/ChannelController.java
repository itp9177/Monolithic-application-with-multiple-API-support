package com.itp.youtube.Rest.controller;

import com.itp.openapi.api.ChannelsApi;
import com.itp.openapi.model.Channel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChannelController implements ChannelsApi {

    @Override
    public ResponseEntity<Void> channelsPost(Channel channel) {
        System.out.println(channel);
        return ResponseEntity.ok(null);
    }
}
