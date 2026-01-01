package guru.springframework.diexample.controller;

import guru.springframework.diexample.service.DiService;

public class DiController {

    private DiService service;

    public DiController(DiService service) {
        this.service = service;
    }

    public String getGreeting() {
        return service.getGreeting();
    }
}
