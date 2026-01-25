package guru.springframework.diexample.database;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!spanish & !polish")
@Component
public class DiDataStore implements DataStore {
    private String user;
    private String password;
    private String url;

    public DiDataStore(@Value("${guru.sfg.username}") String user,
                       @Value("${guru.sfg.password}") String password,
                       @Value("${guru.sfg.url}") String url) {
        this.user = user;
        this.password = password;
        this.url = url;
    }

    public String queryDatabase() {
        return "Connected to database";
    }
}
