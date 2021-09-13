package kg.megacom.computerservice.dao;

import kg.megacom.computerservice.models.dto.Task3;
import kg.megacom.computerservice.models.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepository  extends JpaRepository<Laptop,Integer> {

    @Query("select new kg.megacom.computerservice.models.dto.Task3(u.product.model,u.ram,u.screen) from Laptop u  where u.price>?1")
    List<Task3> executeTask3(double price);
}
