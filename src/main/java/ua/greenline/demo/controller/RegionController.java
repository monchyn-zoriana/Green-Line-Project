package ua.greenline.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ua.greenline.demo.entity.Region;

import ua.greenline.demo.service.RegionService;
import ua.greenline.demo.utils.ObjectMapperUtils;


import java.util.List;

@RestController
@CrossOrigin
public class RegionController {

    @Autowired
    private RegionService regionService;

    @Autowired
    private ObjectMapperUtils modelMapper;

    @PostMapping(value = "/region")
    public Region saveRegion(@RequestBody Region region) {
        return regionService.saveRegion(region);
    }

    @GetMapping(value = "/regions")
    public List<Region> getAllRegions() {
        List<Region> regions = regionService.getAll();
        return regions;
    }

    @DeleteMapping(value = "/region/{id}")
    public boolean getAllRegions(@PathVariable Long id) {
        regionService.delete(id);
        return true;
    }

    @PutMapping("/region")
    public Region updateRegion(@RequestBody Region region) {
        return regionService.updateRegion(region);
    }

}
