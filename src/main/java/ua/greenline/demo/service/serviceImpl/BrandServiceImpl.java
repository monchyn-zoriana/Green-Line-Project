package ua.greenline.demo.service.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.greenline.demo.entity.Brand;
import ua.greenline.demo.repository.BrandRepository;
import ua.greenline.demo.service.BrandService;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepository brandRepository;


@Override
public Brand saveBrand(Brand brand) {
    return brandRepository.save(brand);
}

    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        brandRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Brand updateBrand(Brand brand) {
        brandRepository.updateBrand(brand.getBrand(), brand.getId());
        return brandRepository.getOne(brand.getId());
    }

}
