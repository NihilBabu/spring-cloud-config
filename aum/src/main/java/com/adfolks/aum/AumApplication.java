package com.adfolks.aum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootApplication
public class AumApplication {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = SpringApplication.run(AumApplication.class, args);

        StringRedisTemplate template = ctx.getBean(StringRedisTemplate.class);
        Receiver receiver = ctx.getBean(Receiver.class);

        while (receiver.getCount() == 0) {

            System.out.println("Sending message...");
            template.convertAndSend("chat", "Hello from Redis!");
            Thread.sleep(500L);
        }

    }
}
