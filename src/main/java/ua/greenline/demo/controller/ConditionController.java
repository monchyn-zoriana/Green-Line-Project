package ua.greenline.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ua.greenline.demo.entity.Condition;

import ua.greenline.demo.service.ConditionService;
import ua.greenline.demo.utils.ObjectMapperUtils;

import java.util.List;

@RestController
@CrossOrigin
public class ConditionController {


    @Autowired
    private ConditionService conditionService;

    @Autowired
    private ObjectMapperUtils modelMapper;

    @PostMapping(value = "/condition")
    public Condition saveCondition(@RequestBody Condition condition) {
        return conditionService.saveCondition(condition);
    }

    @GetMapping(value = "/conditions")
    public List<Condition> getAllConditions() {
        List<Condition> conditions = conditionService.getAll();
        return conditions;
    }

    @DeleteMapping(value = "/condition/{id}")
    public boolean getAllConditions(@PathVariable Long id) {
        conditionService.delete(id);
        return true;
    }

    @PutMapping("/condition")
    public Condition updateCondition(@RequestBody Condition condition) {
        return conditionService.updateCondition(condition);
    }

}
