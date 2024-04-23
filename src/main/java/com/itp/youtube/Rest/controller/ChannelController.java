package com.itp.youtube.Rest.controller;

import com.itp.openapi.api.ChannelsApi;
import com.itp.openapi.model.Channel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChannelController implements ChannelsApi {

    /*create channel */
    @Override
    public ResponseEntity<Channel> channelsPost(Channel channel) {
        return ChannelsApi.super.channelsPost(channel);
    }

    /*update a channel */
    @Override
    public ResponseEntity<Channel> channelsPut(Channel channel) {
        return ChannelsApi.super.channelsPut(channel);
    }


}
