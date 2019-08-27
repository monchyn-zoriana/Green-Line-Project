package ua.greenline.demo.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import ua.greenline.demo.entity.Region;

import ua.greenline.demo.repository.RegionRepository;
import ua.greenline.demo.service.RegionService;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionRepository regionRepository;


    @Override
    public Region saveRegion(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public List<Region> getAll() {
        return regionRepository.findAll();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        regionRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Region updateRegion(Region region) {
        regionRepository.updateRegion(region.getRegion(),   region.getId());
        return regionRepository.getOne(region.getId());
    }



}
