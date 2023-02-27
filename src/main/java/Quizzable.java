import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.datasource.init.ScriptException;

import Quizzable.Service.CategorieService;
import Quizzable.Service.DataService;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Quizzable implements CommandLineRunner {

    @Autowired
    private CategorieService catSvc;

    public static void main(String[] args) {SpringApplication.run(Quizzable.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        catSvc.loadUserData();
    }
    
}
