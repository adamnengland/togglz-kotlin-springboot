package com.example.springkotlintogglz.controllers

import com.example.springkotlintogglz.KotlinTestFeatures
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController() {
    @GetMapping("/")
    fun index(): String {
        if (KotlinTestFeatures.HELLO_WORLD.isActive()) {
            return "Hello, World!"
        } else {
            return "Not Implemented"
        }
    }
}