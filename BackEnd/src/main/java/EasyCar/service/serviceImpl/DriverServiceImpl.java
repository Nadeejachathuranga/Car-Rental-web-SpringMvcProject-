package EasyCar.service.serviceImpl;

import EasyCar.dto.DriverDto;
import EasyCar.entity.Driver;
import EasyCar.repo.DriverRepo;
import EasyCar.service.DriverService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class DriverServiceImpl implements DriverService {
    @Autowired
    DriverRepo driverRepo;

    @Autowired
    ModelMapper mapper;


    @Override
    public void add(DriverDto dto) {
        Driver map = mapper.map(dto, Driver.class);
        Driver save = driverRepo.save(map);
    }

    @Override
    public void delete(DriverDto dto) {
        Driver map = mapper.map(dto, Driver.class);
        driverRepo.delete(map);
    }

    @Override
    public void update(DriverDto dto) {
        Driver map = mapper.map(dto, Driver.class);
        Driver save = driverRepo.save(map);
    }

    @Override
    public List<DriverDto> getAll() {
        return null;
    }

    @Override
    public DriverDto find(DriverDto dto) {
        Driver map = mapper.map(dto, Driver.class);
        Driver driver = driverRepo.findById(map.getId()).get();
        return mapper.map(driver,DriverDto.class);
    }

    @Override
    public String findLastId() {
        String lastDriverId = driverRepo.getLastDriverId();
        return lastDriverId;
    }
}
