package RentHome.Service.Register;

import RentHome.Entity.House;

public interface IRegisterBitService {
    House createHouse(House house);
    void deleteHouse(int id);

}
