package EasyCar.controller;

import EasyCar.dto.rentDto;
import EasyCar.service.rentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/rent")
public class rentController {
    @Autowired
    rentService rentService;

    @PostMapping(params = {"rentId","cusId","carId","days","pickDay","status"})
    public rentDto makeRent(String rentId,String cusId,String carId,String days,String pickDay,String status){
        rentDto rentDto = new rentDto(rentId, cusId, carId, days, pickDay, status);
       return rentService.makeRent(rentDto);
    }
}
