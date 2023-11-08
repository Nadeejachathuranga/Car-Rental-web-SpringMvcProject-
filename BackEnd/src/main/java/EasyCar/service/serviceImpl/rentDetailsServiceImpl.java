package EasyCar.service.serviceImpl;

import EasyCar.dto.customerDto;
import EasyCar.dto.rentDetailsDto;
import EasyCar.entity.rentDetails;
import EasyCar.repo.rentDetailsRepo;
import EasyCar.service.rentDetailsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

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

    @Override
    public rentDetailsDto update(rentDetailsDto dto) {
        rentDetails map = mapper.map(dto, rentDetails.class);
        rentDetails save = rentDetailsRepo.save(map);
        rentDetailsDto map1 = mapper.map(save, rentDetailsDto.class);
        return  map1;
    }

    @Override
    public String Deleterent(rentDetailsDto dto) {
        rentDetails map = mapper.map(dto, rentDetails.class);
        rentDetailsRepo.delete(map);
        return  dto.getRentId()+"Deleted";
    }

    @Override
    public rentDetailsDto Find(rentDetailsDto dto) {
        rentDetails map = mapper.map(dto, rentDetails.class);
        rentDetails rentDetails = rentDetailsRepo.findById(map.getRentId()).get();
        return mapper.map(rentDetails, rentDetailsDto.class);
    }
}
