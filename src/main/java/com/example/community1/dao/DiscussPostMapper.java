package com.example.community1.dao;

import com.example.community1.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userid,int offset,int limit);
    int selectDiscussPostRows(int userid);
}
