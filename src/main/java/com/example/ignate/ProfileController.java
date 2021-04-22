package com.example.ignate;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/profile")
@RequiredArgsConstructor
public class ProfileController {

    private final TestService testService;
    final Random random = new Random();

    @GetMapping("/{user}")
    public String getTest1(@PathVariable("user") String user) {
        return testService.getProfileByNameUser(user);
    }

    @GetMapping("/")
    public String getTest2() {
        return "test";
    }

    @GetMapping("/key/{key}/{value}")
    public String putKey(@PathVariable("key") String key,@PathVariable("value") String value) {
        String value1 = "";
        return value1;
    }


    @GetMapping("/rnd/{size}")
    public String putKey(@PathVariable("size") Integer size) {
        for (int i = 0; i < size; i++) {
        }
        return "ok";
    }

    public String getRandomString(int len) {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(len)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
