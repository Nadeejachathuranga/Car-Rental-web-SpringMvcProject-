package EasyCar.service;

import EasyCar.dto.rentDetailsDto;
import EasyCar.dto.rentDto;

import java.util.List;

public interface rentService {
    rentDto makeRent(rentDto dto);
    rentDto defineRent(rentDto dto);

    List<rentDto> getAllReqRent();

    rentDto findById(rentDto rentDto);

}
