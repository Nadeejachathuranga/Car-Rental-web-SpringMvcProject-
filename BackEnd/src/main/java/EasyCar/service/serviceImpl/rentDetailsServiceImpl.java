package EasyCar.service.serviceImpl;

import EasyCar.dto.rentDetailsDto;
import EasyCar.entity.rentDetails;
import EasyCar.repo.rentDetailsRepo;
import EasyCar.service.rentDetailsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class rentDetailsServiceImpl implements rentDetailsService {
    @Autowired
    ModelMapper mapper;
    @Autowired
    rentDetailsRepo rentDetailsRepo;


    @Override
    public rentDetailsDto proceedRent(rentDetailsDto dto) {
        rentDetails map = mapper.map(dto, rentDetails.class);
        rentDetails save = rentDetailsRepo.save(map);
        rentDetailsDto map1 = mapper.map(save, rentDetailsDto.class);
        return  map1;
    }
}
