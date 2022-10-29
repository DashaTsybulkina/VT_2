package dao;

import entity.*;
import entity.criteria.Criteria;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;
import org.xml.sax.SAXException;

public interface ApplianceDAO {
    List<Appliance> find(Criteria criteria) throws ParserConfigurationException, IOException, SAXException;


}
