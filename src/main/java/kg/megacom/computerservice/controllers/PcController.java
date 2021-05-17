package kg.megacom.computerservice.controllers;

import kg.megacom.computerservice.models.dto.PcDto1Ex;
import kg.megacom.computerservice.models.entity.Pc;
import kg.megacom.computerservice.services.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pc")
public class PcController {

    @Autowired
    private PcService pcService;
    @GetMapping("/getAllPriceLessThan500")
    public List<PcDto1Ex> getAllPcLessThan500(@RequestParam Double price){
        return pcService.getAllPcLessThan(price);
    }
}
