package kg.megacom.computerservice.models.dto;

import kg.megacom.computerservice.models.entity.Product;
import lombok.Data;

@Data
public class LaptopDto {

    private int code;
    private Product product;
    private short speed;
    private short ram;
    private double hd;
    private String cd;
    private double price;
}
