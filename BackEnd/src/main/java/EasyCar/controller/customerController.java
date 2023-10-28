package EasyCar.controller;

import EasyCar.dto.customerDto;
import EasyCar.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @PostMapping(params = {"id"})
    public String Add(){
        return "succsessfully";
    }

}
