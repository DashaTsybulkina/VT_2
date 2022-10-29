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

public class ApplianceServiceImpl implements ApplianceService {

    private final DAOFactory daoFactory = DAOFactory.getInstance();
    private final ApplianceDAO applianceDAO = daoFactory.getApplianceDAO();

    @Override
    public List<Appliance> find(Criteria criteria) {
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }
        List<Appliance> appliances = null;
        try {
            appliances = applianceDAO.find(criteria);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
        return appliances;
    }

    @Override
    public Appliance findTheCheapest(Criteria criteria) {
        List<Appliance> appliances = find(criteria);
        if (appliances == null || appliances.isEmpty()) {
            return null;
        }
        return appliances.stream()
                .min((a, b) -> (int) (a.getPrice() - b.getPrice()))
                .get();
    }
}
