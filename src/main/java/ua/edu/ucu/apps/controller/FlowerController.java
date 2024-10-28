package ua.edu.ucu.apps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.Flower;
import ua.edu.ucu.apps.FlowerColor;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/flowerss")
public class FlowerController {

    private List<Flower> flowerList = Arrays.asList(
        new Flower("Rose", 15, FlowerColor.RED),
        new Flower("Tulip", 10, FlowerColor.YELLOW)
    );

    @GetMapping
    public List<Flower> getAllFlowers() {
        return flowerList;
    }
}