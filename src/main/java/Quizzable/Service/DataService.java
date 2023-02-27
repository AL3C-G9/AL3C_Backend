package Quizzable.Service;



import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.init.ScriptException;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;

@Service
public class DataService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void loadSqlFile(String fileName) throws ScriptException, SQLException {
        Resource resource = (Resource) new ClassPathResource(fileName);
        ScriptUtils.executeSqlScript(jdbcTemplate.getDataSource().getConnection(), new EncodedResource((org.springframework.core.io.Resource) resource,"UTF-8"));
    }
}




