package guru.springframework.diexample.controller;

import guru.springframework.diexample.service.LegacyGreetingService;

public class LegacyController {

    public String getGreeting() {
        LegacyGreetingService legacyGreetingService = new LegacyGreetingService();

        return legacyGreetingService.getGreeting();
    }
}
