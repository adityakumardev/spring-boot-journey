package com.av.algorithmvisualizer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewJourney {

    @GetMapping("/journey")
    public String indexString() {
        return "all the best for your journey";
    }
}
