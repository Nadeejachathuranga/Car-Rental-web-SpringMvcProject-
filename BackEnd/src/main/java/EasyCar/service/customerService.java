package EasyCar.service;

import EasyCar.dto.customerDto;

import java.util.List;

public interface customerService {
    void Add(customerDto dto);
    void Update(customerDto dto);
    void Delete(customerDto dto);

   customerDto FindByID(customerDto customerDto);
}
