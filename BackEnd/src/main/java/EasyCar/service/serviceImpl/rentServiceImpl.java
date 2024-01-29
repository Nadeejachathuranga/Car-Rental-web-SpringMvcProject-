package EasyCar.service.serviceImpl;

import EasyCar.dto.rentDetailsDto;
import EasyCar.dto.rentDto;
import EasyCar.entity.rent;
import EasyCar.entity.rentDetails;
import EasyCar.repo.rentRepo;
import EasyCar.service.rentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

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

    @Override
    public List<rentDto> getAllReqRent() {
        List<rent> all = rentRepo.findAll();
        return mapper.map(all, new TypeToken<List<rentDto>>() {
        }.getType());
    }

    @Override
    public rentDto findById(rentDto rentDto) {
        rent map = mapper.map(rentDto, rent.class);
        rent byId = rentRepo.findById(map.getRentId()).get();
       return mapper.map(byId,rentDto.class);
    }

  //  @Override
   /* public List<rentDto> findByCarId(String carId) {
      //  List<rent> all = rentRepo.findBy();
        return mapper.map(all, new TypeToken<List<rentDto>>() {
        }.getType());
    }*/

    @Override
    public String findLastId() {
        String lastRenId = rentRepo.getLastRenId();
        return lastRenId;
    }

}
