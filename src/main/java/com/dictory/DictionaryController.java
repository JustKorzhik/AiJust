package com.dictionary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class DictionaryController {

    private static final Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("key1", "value1");
        dictionary.put("key2", "value2");
        dictionary.put("key3", "value3");
    }

    public static void main(String[] args) {
        SpringApplication.run(DictionaryController.class, args);
    }

    @GetMapping("/get-value")
    public String getValue(@RequestParam String content) {
        return dictionary.getOrDefault(content, "Key not found");
    }
}
