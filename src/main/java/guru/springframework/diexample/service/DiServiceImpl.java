package guru.springframework.diexample.service;

import guru.springframework.diexample.repository.Repo;
import org.springframework.stereotype.Component;

@Component
public class DiServiceImpl implements DiService {

    private Repo repo;

    public DiServiceImpl(Repo repo) {
        this.repo = repo;
    }

    public String getGreeting() {
        return repo.queryDatabase();
    }
}
