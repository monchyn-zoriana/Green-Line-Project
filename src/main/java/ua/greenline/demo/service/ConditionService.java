package ua.greenline.demo.service;

import ua.greenline.demo.entity.Brand;
import ua.greenline.demo.entity.Condition;

import java.util.List;

public interface ConditionService {

    Condition saveCondition(Condition condition);

    List<Condition> getAll();

    void delete(Long id);

    Condition updateCondition(Condition condition);
}
