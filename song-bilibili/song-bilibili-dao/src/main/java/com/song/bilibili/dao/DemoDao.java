package com.song.bilibili.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface DemoDao {
    Map<String, Object> query(Long id);
}
