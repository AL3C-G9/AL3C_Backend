package Quizzable.Quiz;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.hibernate.engine.jdbc.StreamUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;

import Quizzable.Service.CategorieService;
import Quizzable.model.Categorie;
import io.micrometer.core.instrument.util.IOUtils;
import jakarta.annotation.Resource;



@SpringBootApplication
//InitializingBean
public class QuizApplication implements CommandLineRunner{

	/*@Autowired
    private CategorieService catSvc;*/
	@Autowired
	JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
	}
	
    @Override
    public void run(String... args) throws Exception {
        //catSvc.loadUserData();
    }

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//throw new UnsupportedOperationException("Unimplemented method 'afterPropertiesSet'");
		Resource resource = (Resource) new ClassPathResource("insert_categorie.sql");
		String test = StreamUtils.copyToString(((ClassPathResource) resource).getInputStream(), Charset.defaultCharset());
		jdbcTemplate.execute(StreamUtils.(((ClassPathResource) resource).getInputStream(), Charset.defaultCharset());


           
	}
	
}

