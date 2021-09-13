package kg.megacom.computerservice.services;

import kg.megacom.computerservice.models.dto.Task3;

import java.util.List;

public interface LaptopService {
    List<Task3> getLaptops(double price);
}
