package com.integration;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class K8sController {

    @GetMapping("/")
    @Cacheable(key = "test")
    public String root() {
        return "Hello Kubernetes";
    }

    @GetMapping("/healthz")
    public String healthz() {
        return "ok";
    }
}
