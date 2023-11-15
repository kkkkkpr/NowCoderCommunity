package com.example.community1.service;

import com.example.community1.entity.DiscussPost;

import java.util.List;

public interface DiscussPostService {
    List<DiscussPost> findDiscussPost(int userId,int offset,int limit);

    int findDiscussPostRows(int userId);
}
