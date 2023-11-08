package EasyCar.service;

import EasyCar.dto.rentDetailsDto;

public interface rentDetailsService {
    rentDetailsDto proceedRent(rentDetailsDto dto);
    rentDetailsDto update(rentDetailsDto dto);
    String Deleterent(rentDetailsDto dto);
    rentDetailsDto Find(rentDetailsDto dto);
}
