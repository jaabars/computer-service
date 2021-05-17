package kg.megacom.computerservice.models.entity;

import kg.megacom.computerservice.models.enums.Type;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Product")
@Data
public class Product {

    private String maker;

    @Id
    private String model;

    @Enumerated(EnumType.STRING)
    private Type type;
}
