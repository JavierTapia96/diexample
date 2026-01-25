package guru.springframework.diexample.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("polish")
@SpringBootTest
public class PolishDiControllerTest {

    @Autowired
    DiController controller;

    @Test
    void testGetGreetingPolish() {
        String expected = "Połączono z bazą danych";
        String actual = controller.getGreeting();

        assertEquals(expected, actual);
        System.out.println(actual);
    }
}
