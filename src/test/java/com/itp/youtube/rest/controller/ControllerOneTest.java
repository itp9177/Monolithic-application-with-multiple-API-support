package com.itp.youtube.rest.controller;
import com.itp.youtube.Rest.controller.VideoController;
import com.itp.youtube.service.VideoChannelService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;

import static org.junit.Assert.fail;
import static org.mockito.BDDMockito.*;

public class ControllerOneTest {
   private VideoChannelService videoChannelService;
   private VideoController videoController;

    @Before
    public void init(){

        this.videoChannelService=Mockito.mock(VideoChannelService.class);
        this.videoController= new VideoController(videoChannelService);

    }
    @Test
    public void given_videotest1(){
        given(videoChannelService.getChannelById("indu")).willReturn(true);
        given(videoChannelService.getChannelById("abs")).willReturn(false);

        boolean a=videoController.test1("indu");
        boolean b=videoController.test1("abs");

        then(videoChannelService).should().getChannelById("indu");
        then(videoChannelService).should().getChannelById("abs");
        Assert.assertFalse(a);
        Assert.assertFalse(b);
    }
}
