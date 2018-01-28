package RentHome.Service.Search.Impl;

import RentHome.Entity.House;
import RentHome.Repo.HouseRepo;
import RentHome.Service.Search.ISearchBitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchBitService implements ISearchBitService {

    @Autowired
    private HouseRepo houseRepo;

    @Override
    public House findById(int id) {
        House house = houseRepo.findById(id);
        return house;
    }

    @Override
    public List<House> findByAll(int numberOfTenant, boolean smoker, String pet, double size, String location, String priceRange, String accessories) {
        return houseRepo.findAll(numberOfTenant, smoker, pet, size, location, priceRange, accessories);
    }
}
