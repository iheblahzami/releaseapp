package com.example.releaseapp.release_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReleaseController {

    @GetMapping("/")
    public String welcome() {
        return "Release Application Running";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }

    @GetMapping("/version")
    public String version() {
        return "1.0.0";
    }
}
