package guru.springframework.diexample.controller;

import guru.springframework.diexample.database.DiDataStore;
import guru.springframework.diexample.repository.DiRepo;
import guru.springframework.diexample.service.DiService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiControllerTest {

    private DiController controller;
    private DiService service;
    private DiRepo repo;
    private DiDataStore store;

    @BeforeEach
    void setUp() {
        store = new DiDataStore("jt", "test", "jdbc:mysql://localhost:3306/test");
        repo = new DiRepo(store);
        service = new DiService(repo);
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