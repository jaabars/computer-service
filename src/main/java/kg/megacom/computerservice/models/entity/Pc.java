package kg.megacom.computerservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "PC")
@Data
public class Pc {

    @Id
    private int code;
    @ManyToOne
    @JoinColumn(name = "model")
    private Product product;

    private short speed;
    private short ram;
    private double hd;
    private String cd;
    private double price;
}
