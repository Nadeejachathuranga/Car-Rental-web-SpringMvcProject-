package EasyCar.service;

import EasyCar.dto.customerDto;

public interface customerService {
    void Add(customerDto dto);
    void Update(customerDto dto);
    void Delete(customerDto dto);

}
