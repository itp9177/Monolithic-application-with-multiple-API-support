package com.itp.youtube.Rest.controller;
/**
import com.itp.openapi.api.VideosApi;
import com.itp.openapi.model.Comment;
import com.itp.openapi.model.Thumbnail;
import com.itp.openapi.model.ThumbnailRequest;
import com.itp.openapi.model.Video;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VideoController implements VideosApi {


    @Override
    public ResponseEntity<Comment> videosIdCommentsCommentsIDGet(String id, String commentsID) {
        System.out.println(id);
        System.out.println(commentsID);
        return new ResponseEntity<>(HttpStatusCode.valueOf(201));
        //return VideosApi.super.videosIdCommentsCommentsIDGet(id, commentsID);
    }

    @Override
    public ResponseEntity<Thumbnail> videosIdThumbnailsPost(String id, ThumbnailRequest thumbnailRequest) {

        System.out.println(thumbnailRequest.getName());
        return new ResponseEntity<>(HttpStatusCode.valueOf(201));
        //return VideosApi.super.videosIdThumbnailsPost(id, thumbnailRequest);
    }


}
**/