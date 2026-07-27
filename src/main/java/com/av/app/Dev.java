package com.av.app;

import org.springframework.stereotype.Component;

// Making it a bean class by adding @component annotation for application context
@Component
public class Dev {
    
    // a demo method to call

    public void build() {
        System.out.println("Build Started");
    }
}
