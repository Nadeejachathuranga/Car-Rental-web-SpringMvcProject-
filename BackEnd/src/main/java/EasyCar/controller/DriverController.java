package EasyCar.controller;

import EasyCar.dto.DriverDto;
import EasyCar.service.DriverService;
import EasyCar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/driver")
@CrossOrigin
public class DriverController {
    @Autowired
    DriverService driverService;


    @PostMapping(params = {"lid","name","contact","address"})
    public ResponseUtil addDriver(String lid,String name,String contact,String address){
        String result=driverService.findLastId();
        String lsDrverID=result;
        String[] Auto = lsDrverID.split("d");
        int AutoId = Integer.parseInt(Auto[01]);
        AutoId += 1;
        String id = "d" + AutoId;
        DriverDto driverDto = new DriverDto(id, lid, name, contact, address);
        System.out.println("  Hi i am in driver mapping");
        driverService.add(driverDto);
        return new ResponseUtil("Ok", "Successfully Added",driverDto);
    }

    @GetMapping(params = {"id"})
    public ResponseUtil findDriver(String id){
        DriverDto driverDto = new DriverDto(id);
        DriverDto driverDto1 = driverService.find(driverDto);
        return new ResponseUtil("Ok", "Successfully Load",driverDto1);
    }
    @PutMapping(params = {"id","lid","name","contact","address"})
    public ResponseUtil updateDriver(String id,String lid,String name,String contact,String address){
        DriverDto driverDto = new DriverDto(id, lid, name, contact, address);
        System.out.println("  Hi i am in driver put mapping");
       driverService.update(driverDto);
        return new ResponseUtil("Ok", "Successfully Load",driverDto);
    }
    @DeleteMapping(params = {"id"})
    public ResponseUtil removeDriver(String id){
        DriverDto driverDto = new DriverDto(id);
        driverService.delete(driverDto);
        return new ResponseUtil("Ok", "Successfully Load",driverDto.getId());
    }
}
