package com.example.SpringBootAstrologyApi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class AstrologyController {
    @Autowired
    Astrology astrology;

    AtomicLong counter = new AtomicLong();

    @GetMapping("/astrology")
    public Astrology astrology(@RequestParam(value="sign")String sign)
    {
        astrology.setId(counter.incrementAndGet());
        astrology.setContent("Your astrological sign is " +sign);
        return astrology;
    }
}
