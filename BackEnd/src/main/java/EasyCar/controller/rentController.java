package EasyCar.controller;

import EasyCar.dto.rentDto;
import EasyCar.service.rentService;
import EasyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping(params = {"rentId","status"})
    public rentDto defineRent(String rentId,String status){
        rentDto rentDto = new rentDto(rentId,status);
       return rentService.defineRent(rentDto);
    }
    @GetMapping
    public ResponseUtil getAll(){
        return new ResponseUtil("Ok", "Successfully Loaded", rentService.getAllReqRent());
    }
}
