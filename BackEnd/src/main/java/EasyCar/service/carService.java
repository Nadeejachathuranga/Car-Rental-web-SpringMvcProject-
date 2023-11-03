package EasyCar.service;

import EasyCar.dto.carDto;

import java.util.List;

public interface carService {
    void AddCar(carDto dto);
    void Update(carDto dto);
    void Delete(carDto dto);
    carDto Find(carDto dto);
    List<carDto> getAll();
}
