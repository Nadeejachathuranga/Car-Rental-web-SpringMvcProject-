package EasyCar.service.serviceImpl;

import EasyCar.dto.carDto;
import EasyCar.dto.customerDto;
import EasyCar.dto.rentDto;
import EasyCar.entity.customer;
import EasyCar.repo.customerRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import EasyCar.service.customerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class customerServiceImpl implements customerService {

    @Autowired
    customerRepo cusrepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void Add(customerDto dto) {
        customer map = mapper.map(dto, customer.class);
        cusrepo.save(map);
    }

    @Override
    public void Update(customerDto dto) {
        customer map = mapper.map(dto, customer.class);
        cusrepo.save(map);
    }

    @Override
    public void Delete(customerDto dto) {
        cusrepo.delete(new customer(dto.getId()));
    }

    @Override
    public customerDto FindByID(customerDto customerDto) {
        customer map = mapper.map(customerDto, customer.class);
        customer byId = cusrepo.findById(map.getId()).get();
        return mapper.map(byId, customerDto.class);
    }

}
