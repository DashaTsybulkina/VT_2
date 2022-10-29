package service;

import entity.Appliance;
import entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {
    List<Appliance> find(Criteria criteria);

    Appliance findTheCheapest(Criteria criteria);
}
