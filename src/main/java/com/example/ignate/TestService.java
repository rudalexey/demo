package com.example.ignate;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Cacheable("profile")
    public String getProfileByNameUser(String user) {
        return findProfile(user);
    }
    @Cacheable("profile")
    public String getProfileByNameUser1(String user) {
        return findProfile(user);
    }

    private String findProfile(String user) {
        // some long processing
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "test profile1";
    }

}
