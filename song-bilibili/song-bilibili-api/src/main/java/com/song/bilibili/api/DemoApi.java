package com.song.bilibili.api;


import com.song.bilibili.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class DemoApi {

    @Resource
    private DemoService demoService;

    @GetMapping("/demo")
    public Map<String, Object> query(Long id){
        return demoService.query(id);
    }
}
