package com.example.demo.restapi;


import com.example.demo.serwis.Serwis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/")
public class Restapi {

    private Serwis serwis;

    @Autowired
    public Restapi(Serwis sampleService) {
        this.serwis = sampleService;
    }

    @GetMapping("check/{characters}")
    public HashMap getInfoAboutString(@PathVariable String characters) {
        return serwis.checkString(characters);
    }
}
