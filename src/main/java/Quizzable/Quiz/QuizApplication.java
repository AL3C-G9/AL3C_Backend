package Quizzable.Quiz;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class QuizApplication implements CommandLineRunner{

	/*@Autowired
    private CategorieService catSvc;*/


	//@Autowired
	//JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
	}
	
    @Override
    public void run(String... args) throws Exception {
        //catSvc.loadUserData();
    }

//	@Override
//	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//throw new UnsupportedOperationException("Unimplemented method 'afterPropertiesSet'");
		//Resource resource = new ClassPathResource("insert_categorie.sql");
		//String test = StreamUtils.copy(resource.getInputStream(), Charset.defaultCharset());
		
		  // .copyToString( resource.getInputStream(), Charset.defaultCharset());
	//	jdbcTemplate.execute(resourceFile);


           
//	}
	
}

