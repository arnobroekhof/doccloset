package nl.techop.doc.closet.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DocClosetSearch {

    private static void Main(String... args) {
        SpringApplication app = new SpringApplication(new Object[]{DocClosetSearch.class});
        app.run();
    }

}
