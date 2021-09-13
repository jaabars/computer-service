package kg.megacom.computerservice.services.impl;

import kg.megacom.computerservice.dao.LaptopRepository;
import kg.megacom.computerservice.models.dto.Task3;
import kg.megacom.computerservice.services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;
    @Override
    public List<Task3> getLaptops(double price) {
        return laptopRepository.executeTask3(price);
    }
}
