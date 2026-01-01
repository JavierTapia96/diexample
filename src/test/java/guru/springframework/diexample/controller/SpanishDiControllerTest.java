package guru.springframework.diexample.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("spanish")
@SpringBootTest
class SpanishDiControllerTest {

    @Autowired
    DiController diController;

    @Test
    void getGreeting() {
        String greeting = diController.getGreeting();
        assertEquals("Conectado a la base de datos", greeting);
    }
}
