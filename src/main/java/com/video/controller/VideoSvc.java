package com.video.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VideoSvc {
    private static final String VIDEO_SVC_PATH = "/video";


    private List<Video> videos = new ArrayList<Video>();



    @RequestMapping(value=VIDEO_SVC_PATH, method=RequestMethod.POST)
    public @ResponseBody boolean addVideo(@RequestBody Video v){
        return videos.add(v);
    }


    @RequestMapping(value=VIDEO_SVC_PATH, method=RequestMethod.GET)
    public @ResponseBody List<Video> getVideoList(){
        return videos;
    }
}
