package guru.springframework.diexample.controller;

import guru.springframework.diexample.database.DataStore;
import guru.springframework.diexample.database.DiDataStore;
import guru.springframework.diexample.repository.DiRepoImpl;
import guru.springframework.diexample.repository.Repo;
import guru.springframework.diexample.service.DiService;
import guru.springframework.diexample.service.DiServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiControllerTest {

    private DiController controller;
    private DiService service;
    private Repo repo;
    private DataStore store;

    @BeforeEach
    void setUp() {
        store = new DiDataStore("jt", "test", "jdbc:mysql://localhost:3306/test");
        repo = new DiRepoImpl(store);
        service = new DiServiceImpl(repo);
        controller = new DiController(service);
    }

    @Test
    void getGreeting() {
        //GIVEN
        String expected = "Connected to database";

        //WHEN
        String actual = controller.getGreeting();

        //THEN
        assertEquals(expected, actual);
        System.out.println(actual);
    }
}