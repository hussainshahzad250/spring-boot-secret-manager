package com.hussain.controller;

import com.hussain.config.CloudProperties;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class TestController {

    private final CloudProperties cloudProperties;

    @GetMapping("/hello")
    public String getData() {
        return String.format("BUCKET_NAME : %s", cloudProperties.getBucketName());
    }
}
