package com.song.bilibili.service;

import com.song.bilibili.dao.DemoDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class DemoService {

    @Resource
    private DemoDao demoDao;


    public Map<String, Object> query(Long id){
        return demoDao.query(id);
    }

}
