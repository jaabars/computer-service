package kg.megacom.computerservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Printer")
public class Printer {

    @Id
    private int code;
    @ManyToOne
    @JoinColumn(name = "model")
    private Product product;
    private String color;
    private String type;
    private double price;
}
