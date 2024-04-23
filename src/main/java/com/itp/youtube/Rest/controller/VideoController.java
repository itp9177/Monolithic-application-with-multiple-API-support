package com.itp.youtube.Rest.controller;

import com.itp.openapi.api.VideosApi;

import com.itp.openapi.model.Comment;
import com.itp.openapi.model.InitiateVideo;
import com.itp.openapi.model.ListVideoResponse;
import com.itp.openapi.model.VideoRequest;
import com.itp.youtube.service.VideoChannelService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class VideoController implements VideosApi {

    private final VideoChannelService videoChannelService;

    public VideoController(VideoChannelService videoChannelService) {
        this.videoChannelService = videoChannelService;
    }

    public boolean test1(String a){
       return videoChannelService.getChannelById(a);
    }
    @Override
    public ResponseEntity<InitiateVideo> videosPost(InitiateVideo initiateVideo) {
        return VideosApi.super.videosPost(initiateVideo);
    }

    @Override
    public ResponseEntity<ListVideoResponse> videosGet(Integer pageSize, Integer pageNumber, List<String> categories) {
        return VideosApi.super.videosGet(pageSize, pageNumber, categories);
    }

    @Override
    public ResponseEntity<VideoRequest> videosVideoIdGet(String videoId) {
        return VideosApi.super.videosVideoIdGet(videoId);
    }

    @Override
    public ResponseEntity<Comment> videosVideoIdCommentsCommentIdGet(String videoId, String commentId) {
        return VideosApi.super.videosVideoIdCommentsCommentIdGet(videoId, commentId);
    }

    @Override
    public ResponseEntity<VideoRequest> videosPut(VideoRequest videoRequest) {
        return VideosApi.super.videosPut(videoRequest);
    }
}
