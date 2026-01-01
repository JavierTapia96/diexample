package guru.springframework.diexample.service;

import guru.springframework.diexample.repository.LegacyRepo;

public class LegacyGreetingService {
    public String getGreeting() {
        LegacyRepo legacyRepo = new LegacyRepo();

        return legacyRepo.queryDatabase();
    }
}
