package entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {
    private final String category;
    private final Map<String, Object> criteria = new HashMap<String, Object>();

    public Criteria(final String category) {
        this.category = category;
    }


    public Map<String, Object> getCriteria() {
        return criteria;
    }

    public void addCriteria(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }


    public String getCategory() {
        return category;
    }
}
