package EasyCar.controller;

import EasyCar.dto.rentDetailsDto;
import EasyCar.service.rentDetailsService;
import EasyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/rentDetails")
public class rentDetailsController {
    @Autowired
    rentDetailsService rentService;

    @PostMapping(params = {"rId","Skm","Fkm","payId","reDay","toDay","tKm"})
    public ResponseUtil ProceedRent(String rId, String Skm, String Fkm, String payId, String reDay, String toDay, String tKm){
        rentDetailsDto rentDetailsDto = new rentDetailsDto(rId,reDay,Skm,toDay,tKm,Fkm,payId);
        System.out.println("hee hee");
       return new ResponseUtil("Ok", "Successfully Loaded",rentService.proceedRent(rentDetailsDto));
    }
    @DeleteMapping(params = {"rId"})
    public ResponseUtil DeleteRD(String rId){
        rentDetailsDto rdto = new rentDetailsDto(rId);
        String deleterent = rentService.Deleterent(rdto);
        return new ResponseUtil("Ok","Successfully Loaded",deleterent);
    }
}
