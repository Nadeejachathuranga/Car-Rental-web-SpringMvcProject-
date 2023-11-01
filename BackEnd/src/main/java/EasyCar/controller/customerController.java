package EasyCar.controller;

import EasyCar.dto.customerDto;
import EasyCar.service.customerService;
import EasyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class customerController {

    @Autowired
    customerService cusServic;

    @PostMapping(params = {"id","name","address","lid","contact","email"})
    public String Add(String id,String name,String address,String lid,String contact,String email){
        customerDto customerDto = new customerDto(id, name, address,lid,contact,email);
        cusServic.Add(customerDto);
        return "sss";
    }
   /* @PutMapping(params = {"id","name","address","lid","contact","email"})
    public String update(String id,String name,String address,String lid,String contact,String email){
        customerDto customerDto = new customerDto(id, name, address,lid,contact,email);
        cusServic.Update(customerDto);
        return "succsessfully";
    }*/
    @DeleteMapping(params = {"id"})
    String Detete(String id){
        cusServic.Delete(new customerDto(id));
        return "delete successfully";
    }
    
    @GetMapping(params = {"id"})
    public  ResponseUtil findCus(String id){
        customerDto customerDto = new customerDto(id);
        customerDto customerDtos = cusServic.FindByID(customerDto);
        return  new ResponseUtil("Ok", "Successfully Loaded",customerDtos);
    }



}
