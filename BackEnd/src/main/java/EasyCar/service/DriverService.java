package EasyCar.service;

import EasyCar.dto.DriverDto;
import EasyCar.dto.rentDto;

import java.util.List;

public interface DriverService {
    public void add(DriverDto dto);
    public void delete(DriverDto dto);
    public void update(DriverDto dto);
    public List<DriverDto> getAll();
    public DriverDto find(DriverDto dto);
    public String findLastId();
}
