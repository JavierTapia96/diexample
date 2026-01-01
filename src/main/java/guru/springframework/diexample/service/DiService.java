package guru.springframework.diexample.service;

import guru.springframework.diexample.repository.DiRepo;

public class DiService {

    private DiRepo repo;

    public DiService(DiRepo repo) {
        this.repo = repo;
    }

    public String getGreeting() {
        return repo.queryDatabase();
    }
}
