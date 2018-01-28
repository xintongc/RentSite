package RentHome.Controller;

import RentHome.Entity.House;
import RentHome.Model.HouseBitResults;
import RentHome.Service.Register.IRegisterBitService;

import RentHome.Service.Search.ISearchBitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/house")
public class HouseController {

    @Autowired
    private IRegisterBitService RegisterBitService;
    @Autowired
    private ISearchBitService SearchBitService;


    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public HouseBitResults registerHouse(House house){
        RegisterBitService.createHouse(house);
        return null;
    }

    @RequestMapping(value = "/search",method = RequestMethod.POST)
    public HouseBitResults searchHouses(@RequestBody int numberOfTenant, boolean smoker, String pet, double size, String location, String priceRange, String accessories){
        SearchBitService.findByAll(numberOfTenant, smoker, pet, size, location, priceRange, accessories);
        return null;
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public HouseBitResults deleteHouses(@RequestBody int id){
        if(SearchBitService.findById(id) != null) {
            RegisterBitService.deleteHouse(id);
        }
        return null;
    }
}
