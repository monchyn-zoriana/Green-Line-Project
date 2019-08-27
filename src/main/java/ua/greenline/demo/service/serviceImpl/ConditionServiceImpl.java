package ua.greenline.demo.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.greenline.demo.entity.Brand;
import ua.greenline.demo.entity.Condition;
import ua.greenline.demo.repository.BrandRepository;
import ua.greenline.demo.repository.ConditionRepository;
import ua.greenline.demo.service.ConditionService;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ConditionServiceImpl implements ConditionService {



    @Autowired
    private ConditionRepository conditionRepository;


    @Override
    public Condition saveCondition(Condition condition) {
        return conditionRepository.save(condition);
    }

    @Override
    public List<Condition> getAll() {
        return conditionRepository.findAll();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        conditionRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Condition updateCondition(Condition condition) {
        conditionRepository.updateCondition(condition.getConditionCar(), condition.getId());
        return conditionRepository.getOne(condition.getId());
    }
}
