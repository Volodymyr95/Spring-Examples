package com.lits.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    private List<String> data = new ArrayList<>();

    @GetMapping
    public Flux<String> getdata() {
        data.add("one");
        data.add("cdscs");
        data.add("cdscs");
        data.add(null);
        data.add("cdscs");
        data.add("cdscs");
        data.add("cdscs");
        data.add("cdscs");
        data.add("cdscs");
        data.add("cdscs");

        Integer [] arr = {1,2,3,4,5,6};

       return Flux.fromIterable(data)
               .delayElements(Duration.ofSeconds(1))
               .map(s -> s.toLowerCase())
               .onErrorResume( s -> Flux.just("Error"))
               .doOnComplete(() -> System.out.println("finish"));

    }

    @GetMapping
    @RequestMapping("/add")
    public void addToData() {
        data.add("New");
    }

}
