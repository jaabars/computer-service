package kg.megacom.computerservice.controllers;

import kg.megacom.computerservice.models.dto.Task3;
import kg.megacom.computerservice.services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/laptop")
public class LaptopController {


    @Autowired
    private LaptopService laptopService;

    @GetMapping("/ex3")
    public List<Task3> getAllLaptops(@RequestParam double price){
        return laptopService.getLaptops(price);
    }
}
