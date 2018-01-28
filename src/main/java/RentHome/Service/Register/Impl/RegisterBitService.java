package RentHome.Service.Register.Impl;

import RentHome.Entity.House;
import RentHome.Repo.HouseRepo;
import RentHome.Service.Register.IRegisterBitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterBitService implements IRegisterBitService {

    @Autowired
    private
    HouseRepo houseRepo;

    @Override
    public House createHouse(House house) {
        houseRepo.saveAndFlush(house);
        return null;
    }

    @Override
    public void deleteHouse(int id) {
        houseRepo.delete(id);
    }
}
