package EasyCar.service.serviceImpl;

import EasyCar.dto.rentDto;
import EasyCar.entity.rent;
import EasyCar.repo.rentRepo;
import EasyCar.service.rentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class rentServiceImpl implements rentService {
    @Autowired
    EasyCar.repo.rentRepo rentRepo;
    @Autowired
    ModelMapper mapper;

    @Override
    public rentDto makeRent(rentDto dto) {
        rent map = mapper.map(dto, rent.class);
        rent save = rentRepo.save(map);
        return mapper.map(save,rentDto.class);
    }

    @Override
    public rentDto defineRent(rentDto dto) {
        rent map = mapper.map(dto, rent.class);
        rent save = rentRepo.save(map);
       return mapper.map(save,rentDto.class);
    }
}
