package EasyCar.service.serviceImpl;

import EasyCar.dto.customerDto;
import EasyCar.entity.customer;
import EasyCar.repo.customerRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import EasyCar.service.customerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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

}
