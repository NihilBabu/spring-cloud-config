package com.adfolks.aum;

import java.util.concurrent.atomic.AtomicInteger;

public class Receiver {
    private AtomicInteger counter = new AtomicInteger();

    public void receiveMessage(String message) {
        System.out.println("Message "+message);
        counter.incrementAndGet();
    }

    public int getCount() {
        return counter.get();
    }
}
