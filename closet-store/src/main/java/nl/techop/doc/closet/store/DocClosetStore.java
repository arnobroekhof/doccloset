package nl.techop.doc.closet.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DocClosetStore {
    private static void Main(String... args) {
        SpringApplication app = new SpringApplication(new Object[]{DocClosetStore.class});
        app.run();
    }
}
