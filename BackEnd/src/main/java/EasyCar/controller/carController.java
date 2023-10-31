package EasyCar.controller;

import EasyCar.dto.carDto;
import EasyCar.service.carService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
@CrossOrigin
public class carController {
    @Autowired
    carService carService;

    @PostMapping(params = {"id","name","brand","type","regNo","priceExtraKm","transmissonType","rate","noOfPassenger","fuel","color"})
    public String addCar(String id,String name,String brand,String type,String regNo,String priceExtrakm,String transmissonType,
                         String rate,String noOfPassenger,String fuel,String color){
        carDto carDto = new carDto(id,name, brand, type, regNo, priceExtrakm, transmissonType, rate, noOfPassenger, fuel, color);
        carService.AddCar(carDto);
        return "car servlet invoked";
    }
    @GetMapping(params = {"id"})
    carDto getCar(String id){
        carDto carDto = new carDto(id);
        return carService.Find(carDto);

    }
    @DeleteMapping(params = {"id"})
    public String deleteCar(String id){
        carDto carDto = new carDto(id);
        carService.Delete(carDto);
        return id+" car deleted ";
    }
}
