package EasyCar.controller;

import EasyCar.dto.carDto;
import EasyCar.service.carService;
import EasyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
@CrossOrigin
public class carController {
    @Autowired
    carService carService;

    @PutMapping(params ={"id","name","brand","type","regNo","priceExtraKm","transmissonType","rate","noOfPassenger","fuel","color","freeKmDay"})
    public ResponseUtil UpdateCar(String id,String name,String brand,String type,String regNo,String priceExtraKm,String transmissonType,
                                  String rate,String noOfPassenger,String fuel,String color,String freeKmDay){
        carDto carDto = new carDto(id, name, brand, type, regNo, priceExtraKm, freeKmDay, transmissonType, rate, noOfPassenger, fuel, color);
        carService.Update(carDto);
        System.out.println("hey i am in Update method");
        return new ResponseUtil("Ok", "Successfully Updated",id);
    }

    @PostMapping(params = {"name","brand","type","regNo","priceExtraKm","transmissonType","rate","noOfPassenger","fuel","color","freeKmDay"})
    public ResponseUtil addCar(String name,String brand,String type,String regNo,String priceExtraKm,String transmissonType,
                         String rate,String noOfPassenger,String fuel,String color,String freeKmDay){
        
        String returnId = carService.findLastId();
        String lsCarId=returnId;
        String[] Auto = lsCarId.split("car");
        int AutoId = Integer.parseInt(Auto[01]);
        AutoId += 1;
       String id = "car" + AutoId;
        carDto carDto = new carDto(id, name, brand, type, regNo, priceExtraKm, freeKmDay, transmissonType, rate, noOfPassenger, fuel, color);
        System.out.println(id);
        System.out.println("received");
        System.out.println(carDto.getPriceExtraKm());
        System.out.println(carDto.getFreeKmDay());
        carService.AddCar(carDto);
        return new ResponseUtil("Ok", "Successfully Loaded",id);
    }
    @GetMapping(params = {"id"})
    ResponseUtil getCar(String id){
        carDto carDto = new carDto(id);
      return  new ResponseUtil("Ok", "Successfully Loaded",carService.Find(carDto));
    }
    @DeleteMapping(params = {"id"})
    public String deleteCar(String id){
        System.out.println("i am In delete ");
        carDto carDto = new carDto(id);
        carService.Delete(carDto);
        return id+" car deleted ";
    }
    @GetMapping
    public ResponseUtil getAll(){
        return new ResponseUtil("Ok","Successfully Load",carService.getAll());
    }
}
