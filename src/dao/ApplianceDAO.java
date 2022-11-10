package dao;

import entity.*;
import entity.criteria.Criteria;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;
import org.xml.sax.SAXException;

/**
 * Interface for ApplianceDAO
 */
public interface ApplianceDAO {
    /**
     *
     * @param criteria
     * @return all found appliances
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    List<Appliance> findAppliance(Criteria criteria) throws ParserConfigurationException, IOException, SAXException;


}
