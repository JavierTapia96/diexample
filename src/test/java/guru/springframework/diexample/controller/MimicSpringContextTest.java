package guru.springframework.diexample.controller;

import guru.springframework.diexample.database.DataStore;
import guru.springframework.diexample.database.DiDataStore;
import guru.springframework.diexample.repository.DiRepoImpl;
import guru.springframework.diexample.repository.Repo;
import guru.springframework.diexample.service.DiService;
import guru.springframework.diexample.service.DiServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MimicSpringContextTest {

    public static Map<String, Object> context = new HashMap<>();

    public static void addBean(String beanName, Object bean) {
        context.put(beanName, bean);
    }

    public static Object getBean(String beanName) {
        return context.get(beanName);
    }

    @BeforeAll
    static void beforeAll() {
        addBean("dataStore", new DiDataStore("jt", "test", "jdbc:mysql://localhost:3306/test"));
        addBean("repo", new DiRepoImpl((DataStore) getBean("dataStore")));
        addBean("service", new DiServiceImpl((Repo) getBean("repo")));
        addBean("controller", new DiController((DiService) getBean("service")));
    }

    @Test
    void getControllerFromContext() {
        DiController controller = (DiController) getBean("controller");
        System.out.println(controller.getGreeting());
    }
}
