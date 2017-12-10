package wepa.k2017.htyo;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import org.h2.tools.RunScript;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author THyyppä
 */
@SpringBootApplication
public class DiscussionApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DiscussionApplication.class, args); 
        // Open connection to database
        Connection connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
        //Connection connection = DriverManager.getConnection("jdbc:h2:./database", "sa", "");
        
        try {
            // If database has not yet been created, create it
            //RunScript.execute(connection, new FileReader("database-schema.sql"));
            //ResultSet execute = RunScript.execute(connection, new FileReader("database-import.sql"));
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        }
    }
}
    
