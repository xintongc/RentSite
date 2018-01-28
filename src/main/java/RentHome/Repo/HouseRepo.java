package RentHome.Repo;


import RentHome.Entity.House;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HouseRepo extends JpaRepository<House, Integer> {
    House findById(int id);
    List<House> findAll(int numberOfTenant,boolean smoker,String pet,double size,String location,String priceRange,String accessories);
}
