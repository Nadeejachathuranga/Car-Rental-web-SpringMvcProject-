package EasyCar.controller;

import EasyCar.dto.rentDetailsDto;
import EasyCar.service.rentDetailsService;
import EasyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/rentDetails")
public class rentDetailsController {
    @Autowired
    rentDetailsService rentService;

    @PostMapping(params = {"rId","Skm","Fkm","payId","reDay","toDay","tKm"})
    public ResponseUtil ProceedRent(String rId, String Skm, String Fkm, String payId, String reDay, String toDay, String tKm){
        rentDetailsDto rentDetailsDto = new rentDetailsDto(rId, Skm, Fkm, payId, reDay, toDay, tKm);
        System.out.println("hee hee");
       return new ResponseUtil("Ok", "Successfully Loaded",rentService.proceedRent(rentDetailsDto));
    }
}
