package guru.springframework.diexample.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LegacyControllerTest {

    @Test
    void getGreeting() {
        LegacyController legacyController = new LegacyController();
        assertEquals("Connected to database", legacyController.getGreeting());
        System.out.println(legacyController.getGreeting());
    }

}