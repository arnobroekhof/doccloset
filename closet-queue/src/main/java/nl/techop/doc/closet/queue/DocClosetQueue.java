package nl.techop.doc.closet.queue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DocClosetQueue {

    public static void main(String... args) {

        SpringApplication app = new SpringApplication(new Object[]{DocClosetQueue.class});
        app.run();
    }
}
