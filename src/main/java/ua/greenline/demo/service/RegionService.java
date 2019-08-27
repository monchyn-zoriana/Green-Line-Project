package ua.greenline.demo.service;



import ua.greenline.demo.entity.Region;

import java.util.List;

public interface RegionService {

    Region saveRegion(Region region);

    List<Region> getAll();

    void delete(Long id);

    Region updateRegion(Region region);
}
