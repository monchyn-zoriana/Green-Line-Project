package ua.greenline.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import ua.greenline.demo.entity.Brand;

import ua.greenline.demo.service.BrandService;

import ua.greenline.demo.utils.ObjectMapperUtils;

import java.util.List;

@RestController
@CrossOrigin
public class BrandController {

    @Autowired
    private BrandService brandService;

    @Autowired
    private ObjectMapperUtils modelMapper;

    @PostMapping(value = "/brand")
    public Brand saveBrand(@RequestBody Brand brand) {
        return brandService.saveBrand(brand);
    }

    @GetMapping(value = "/brands")
    public List<Brand> getAllBrands() {
        List<Brand> brands = brandService.getAll();
        return brands;
    }

    @DeleteMapping(value = "/brand/{id}")
    public boolean getAllBrands(@PathVariable Long id) {
        brandService.delete(id);
        return true;
    }

    @PutMapping("/brand")
    public Brand updateBrand(@RequestBody Brand brand) {
        return brandService.updateBrand(brand);
    }


}
