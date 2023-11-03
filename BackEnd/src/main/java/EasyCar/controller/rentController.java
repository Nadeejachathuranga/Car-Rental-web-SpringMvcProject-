package EasyCar.controller;

import EasyCar.dto.rentDetailsDto;
import EasyCar.dto.rentDto;
import EasyCar.service.rentService;
import EasyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/rent")
public class rentController {
    String lsRentId;
    String AutoGeneretId;
    @Autowired
    rentService rentService;

    @PostMapping(params = {"rentId","cusId","carId","days","pickDay","statuss"})
    public rentDto makeRent(String rentId,String cusId,String carId,String days,String pickDay,String statuss){
        rentDto rentDto = new rentDto(AutoGeneretId, cusId, carId, days, pickDay, statuss);
        System.out.println("Invode heeeeeeee");
       return rentService.makeRent(rentDto);
    }

    @PutMapping(params = {"rentId","cusId","carId","days","pickDay","statuss"})
    public rentDto defineRent(String rentId,String cusId,String carId,String days,String pickDay,String statuss){
        rentDto rentDto = new rentDto(rentId, cusId, carId, days, pickDay, statuss);
       return rentService.defineRent(rentDto);
    }
    @GetMapping
    public ResponseUtil getAll(){
        return new ResponseUtil("Ok", "Successfully Loaded", rentService.getAllReqRent());
    }

    @GetMapping(params = {"id"})
    public ResponseUtil findById(String id){
        rentDto rentDto = new rentDto(id);
        rentDto byId = rentService.findById(rentDto);
        return new ResponseUtil("Ok", "Successfully Loaded",byId);
    }
    @PostMapping(params = {"id","id"})
    public ResponseUtil hhh(){
        String lastId = rentService.findLastId();
        lsRentId=lastId;
        String[] Auto = lsRentId.split("rent");
        int AutoId = Integer.parseInt(Auto[01]);
        AutoId += 1;
        AutoGeneretId = "rent" + AutoId;
        System.out.println(lastId);
        System.out.println(AutoGeneretId);
        return new ResponseUtil("Ok", "Successfully Loaded",lastId);
    }

}


