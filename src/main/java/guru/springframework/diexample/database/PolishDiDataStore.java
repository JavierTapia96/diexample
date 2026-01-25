package guru.springframework.diexample.database;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("polish")
@Component
public class PolishDiDataStore implements DataStore {

    @Override
    public String queryDatabase() {
        return "Połączono z bazą danych";
    }
}
