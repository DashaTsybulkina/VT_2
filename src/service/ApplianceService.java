package service;

import entity.Appliance;
import entity.criteria.Criteria;

import java.util.List;

/**
 * Interface of Searching Service
 */
public interface ApplianceService {
    List<Appliance> findApplianceByCriteria(Criteria criteria);

    Appliance findCheapestAppliance(Criteria criteria);
}
