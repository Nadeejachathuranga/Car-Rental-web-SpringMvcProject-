package EasyCar.service.serviceImpl;

import EasyCar.dto.carDto;
import EasyCar.dto.rentDto;
import EasyCar.entity.car;
import EasyCar.repo.carRepo;
import EasyCar.service.carService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class carServiceImpl implements carService {
    @Autowired
    carRepo carRepo;
    @Autowired
    ModelMapper mapper;

    @Override
    public void AddCar(carDto dto) {
        car map = mapper.map(dto, car.class);
        carRepo.save(map);
    }

    @Override
    public void Update(carDto dto) {
        car map = mapper.map(dto, car.class);
        carRepo.save(map);
    }

    @Override
    public void Delete(carDto dto) {
        car map = mapper.map(dto, car.class);
        carRepo.delete(map);
    }

    @Override
    public carDto Find(carDto dto) {
        car map = mapper.map(dto, car.class);
        car car = carRepo.findById(map.getId()).get();
        return mapper.map(car, carDto.class);
    }

    @Override
    public List<carDto> getAll() {
        List<car> all = carRepo.findAll();
        return mapper.map(all, new TypeToken<List<carDto>>() {
        }.getType());
    }

    @Override
    public String findLastId() {
        String lastCarId = carRepo.getLastCarId();
        return lastCarId;
    }

}
