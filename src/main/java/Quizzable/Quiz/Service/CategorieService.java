package Quizzable.Quiz.Service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.init.ScriptException;
import org.springframework.core.io.Resource;

import Quizzable.Quiz.repository.CategorieRepository;
import Quizzable.Quiz.model.Categorie;
import io.micrometer.core.instrument.util.IOUtils;

@Service
public class CategorieService {
    @Autowired
    CategorieRepository CategorieRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Categorie> getAllCategorie() {
        return CategorieRepository.findAll();
    }

    public Categorie getCategorie(String id) {
        return CategorieRepository.findById(id).get();
    }

    public void saveCategorie(Categorie Categorie) {
        CategorieRepository.save(Categorie);
    }

    public void deleteCategorie(String id) {
        CategorieRepository.deleteById(id);
    }

    public void loadCategorieData() throws ScriptException, SQLException {
        Resource resource = new ClassPathResource("insert_categorie.sql");
        try {
            jdbcTemplate
                    .execute(IOUtils.toString(((ClassPathResource) resource).getInputStream(), StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}