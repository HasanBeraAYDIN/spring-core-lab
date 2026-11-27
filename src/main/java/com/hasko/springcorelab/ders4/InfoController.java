package com.hasko.springcorelab.ders4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    private final String appName;

    public InfoController(@Value("${app.name}") String appName) {
        this.appName = appName;
    }

    @GetMapping("/info")
    public String info() {
        return appName;
    }
}
