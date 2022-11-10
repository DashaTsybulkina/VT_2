package service.impl;

import dao.ApplianceDAO;
import dao.DAOFactory;
import entity.Appliance;
import entity.criteria.Criteria;
import org.xml.sax.SAXException;
import service.ApplianceService;
import service.validation.Validator;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

/**
 * Implementation of Searching Service
 */
public class ApplianceSearchingServiceImpl implements ApplianceService {

    private final DAOFactory daoFactory = DAOFactory.getInstance();
    private final ApplianceDAO applianceDAO = daoFactory.getApplianceDAO();

    /**
     * Appliance searching
     * @param criteria
     * @return list of appliances or null
     */
    @Override
    public List<Appliance> findApplianceByCriteria(Criteria criteria) {
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }

        List<Appliance> appliances = null;

        try {
            appliances = applianceDAO.findAppliance(criteria);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }

        return appliances;
    }

    /**
     * One additional method to find the cheapest appliance
     * @param criteria
     * @return the cheapest aplliance or null
     */
    @Override
    public Appliance findCheapestAppliance(Criteria criteria) {
        List<Appliance> appliances = findApplianceByCriteria(criteria);

        if (appliances == null) {
            return null;
        }
        if(appliances.isEmpty())
            return null;

        return appliances.stream()
                .min((a, b) -> (int) (a.getPrice() - b.getPrice()))
                .get();
    }
}
