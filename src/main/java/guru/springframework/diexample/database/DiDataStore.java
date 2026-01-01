package guru.springframework.diexample.database;

public class DiDataStore {
    private String user;
    private String password;
    private String url;

    public DiDataStore(String user, String password, String url) {
        this.user = user;
        this.password = password;
        this.url = url;
    }

    public String queryDatabase() {
        return "Connected to database";
    }
}
