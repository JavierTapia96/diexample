package guru.springframework.diexample.repository;

import guru.springframework.diexample.database.DiDataStore;

public class DiRepo {

    private DiDataStore store;

    public DiRepo(DiDataStore store) {
        this.store = store;
    }

    public String queryDatabase() {
        return store.queryDatabase();
    }
}
