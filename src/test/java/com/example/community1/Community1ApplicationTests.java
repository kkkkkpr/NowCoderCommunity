package com.example.community1;

import com.example.community1.dao.DiscussPostMapper;
import com.example.community1.entity.DiscussPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Community1ApplicationTests {
    @Autowired
    DiscussPostMapper discussPostMapper;

    @Test
    void testSelectDiscussPost() {
        List<DiscussPost> res=discussPostMapper.selectDiscussPosts(0,0,10);
        for(DiscussPost post:res){
            System.out.println(post);
        }
    }
    @Test
    void testSelectDiscussPostRows(){
        int res=discussPostMapper.selectDiscussPostRows(0);
        System.out.println(res);
    }

}
