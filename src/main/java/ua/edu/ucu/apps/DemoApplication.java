package ua.edu.ucu.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SpringBootApplication
public class DemoApplication {

    @GetMapping("/flowers")
    public Flower[] allFlowers() {
        Flower[] flowers = new Flower[2];
        flowers[0] = new Flower("Rose", 20, FlowerColor.RED);
        flowers[1] = new Flower("Tulip", 15, FlowerColor.YELLOW);
        return flowers;
    }

    @GetMapping("/")
    public String empty(){
        return "Hello World!";
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
