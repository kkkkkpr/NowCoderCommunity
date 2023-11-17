package com.example.community1;

import com.example.community1.util.MailClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MailTest {
    @Autowired
    private MailClient mailClient;

    @Test
    public void testText(){
        mailClient.sendMail("1012286776@qq.com","Test","Welcome");
    }
}
