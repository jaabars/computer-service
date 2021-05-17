package kg.megacom.computerservice.models.dto;

import kg.megacom.computerservice.models.entity.Product;
import lombok.Data;

@Data
public class PrinterDto {

    private int code;
    private Product product;
    private String color;
    private String type;
    private double price;
}
