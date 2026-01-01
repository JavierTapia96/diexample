package guru.springframework.diexample.database;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("spanish")
@Component
public class SpanishDiDataStore implements DataStore {

    @Override
    public String queryDatabase() {
        return "Conectado a la base de datos";
    }
}
