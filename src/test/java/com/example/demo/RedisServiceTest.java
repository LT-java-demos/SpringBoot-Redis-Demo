package com.example.demo;

import com.example.entity.User;
import com.example.redis.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisServiceTest {

    @Autowired
    private RedisService redisService;

    @Test
    public void setRedisUser() {
        User user = new User();
        user.setName("Leonard");
        user.setAge(18);
        redisService.set("user1", user);
        User redisUser = (User) redisService.get("user1");
        System.out.println(redisUser.toString());
    }
}
