package RentHome.Service.Search;

import RentHome.Entity.House;

import java.util.List;

public interface ISearchBitService {
    House findById(int id);
    List<House> findByAll(int numberOfTenant, boolean smoker, String pet, double size, String location, String priceRange, String accessories);
}
