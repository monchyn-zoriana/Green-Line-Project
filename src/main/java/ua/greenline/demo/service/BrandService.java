package ua.greenline.demo.service;

import ua.greenline.demo.entity.Brand;

import java.util.List;


public interface BrandService {


    Brand saveBrand(Brand brand);

    List<Brand> getAll();

    void delete(Long id);

   Brand updateBrand(Brand brand);
}
