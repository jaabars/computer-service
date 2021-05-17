package kg.megacom.computerservice.models.dto;

import kg.megacom.computerservice.models.enums.Type;
import lombok.Data;

@Data
public class ProductDto {
    private String maker;


    private String model;

    private Type type;
}
