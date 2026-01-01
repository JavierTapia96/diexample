package guru.springframework.diexample.controller;

import guru.springframework.diexample.service.DiService;
import org.springframework.stereotype.Component;

@Component
public class DiController {

    private DiService service;

    public DiController(DiService service) {
        this.service = service;
    }

    public String getGreeting() {
        return service.getGreeting();
    }
}
