package kg.megacom.computerservice.models.dto;

import lombok.Data;

@Data
public class Task3 {
    private String model;
    private int ram;
    private int screen;

    public Task3(String model, int ram, int screen) {
        this.model = model;
        this.ram = ram;
        this.screen = screen;
    }

    public Task3() {
    }
}
