package service.validation;

import entity.*;
import entity.criteria.*;

import java.util.HashMap;
import java.util.Map;

/**
 * This class validates properties for different categories
 */

public class Validator {
    /**
     * Map contains pairs: name of property - validation method
     */
    private static final Map<String, CriteriaValidator> validatorMap = new HashMap<>();

    static {
        validatorMap.put(SearchCriteria.Appliance.PRICE.toString(), Validator::validatePrice);

        validatorMap.put(SearchCriteria.Oven.CONSUMPTION.toString(), Validator::validatePowerConsumption);
        validatorMap.put(SearchCriteria.Oven.WEIGHT.toString(), Validator::validateWeight);
        validatorMap.put(SearchCriteria.Oven.CAPACITY.toString(), Validator::validateCapacity);
        validatorMap.put(SearchCriteria.Oven.HEIGHT.toString(), Validator::validateHeight);
        validatorMap.put(SearchCriteria.Oven.WIDTH.toString(), Validator::validateWidth);

        validatorMap.put(SearchCriteria.Laptop.OS.toString(), Validator::validateOS);
        validatorMap.put(SearchCriteria.Laptop.BATTERY.toString(), Validator::validateBatteryCapacity);
        validatorMap.put(SearchCriteria.Laptop.MEMORY.toString(), Validator::validateMemory);
        validatorMap.put(SearchCriteria.Laptop.CPU_NAME.toString(), Validator::validateCPU);
        validatorMap.put(SearchCriteria.Laptop.SCREEN_SIZE.toString(), Validator::validateScreenSize);


        validatorMap.put(SearchCriteria.Refrigerator.CAPACITY.toString(), Validator::validateCapacity);

        validatorMap.put(SearchCriteria.Speakers.POWER.toString(), Validator::validateSpeakersPower);
        validatorMap.put(SearchCriteria.Speakers.VOLUME.toString(), Validator::validateSpeakersVolume);
        validatorMap.put(SearchCriteria.Speakers.FREQUENCY.toString(), Validator::validateFrequencyRange);

        validatorMap.put(SearchCriteria.Tablet.COLOR.toString(), Validator::validateColor);
        validatorMap.put(SearchCriteria.Tablet.MEMORY.toString(), Validator::validateMemory);

        validatorMap.put(SearchCriteria.VacuumCleaner.POWER.toString(), Validator::validatePower);
        validatorMap.put(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(), Validator::validateFilterType);
        validatorMap.put(SearchCriteria.VacuumCleaner.CONSUMPTION.toString(), Validator::validateConsumption);
        validatorMap.put(SearchCriteria.VacuumCleaner.WEIGHT.toString(), Validator::validateWeight);
    }

    /**
     * This method validates category of criteria
     * @param criteria
     * @return result of category validation (true/false)
     */
    public static boolean criteriaValidator(Criteria criteria) {
        if (criteria.getCategory().equals(Oven.class.getSimpleName())) {
            return validateOven(criteria.getCriteria());
        } else if (criteria.getCategory().equals(Laptop.class.getSimpleName())) {
            return validateLaptop(criteria.getCriteria());
        } else if (criteria.getCategory().equals(Refrigerator.class.getSimpleName())) {
            return validateRefrigerator(criteria.getCriteria());
        } else if (criteria.getCategory().equals(Tablet.class.getSimpleName())) {
            return validateTablet(criteria.getCriteria());
        } else if (criteria.getCategory().equals(Speakers.class.getSimpleName())) {
            return validateSpeakers(criteria.getCriteria());
        } else if (criteria.getCategory().equals(VacuumCleaner.class.getSimpleName())) {
            return validateVacuumCleaner(criteria.getCriteria());
        }
        return false;
    }

    //стоит переписать логику

    /**
     * Oven validation
     * @param criteria
     * @return
     */
    private static boolean validateOven(Map<String, Object> criteria) {
        for (String key : criteria.keySet()) {
            try {
                SearchCriteria.Oven.valueOf(key);
            } catch (IllegalArgumentException | NullPointerException e) {
                return false;
            }
        }
        return validateCriteria(criteria);
    }

    /**
     * Laptop validation
     * @param criteria
     * @return
     */
    private static boolean validateLaptop(Map<String, Object> criteria) {
        for (String key : criteria.keySet()) {
            try {
                SearchCriteria.Laptop.valueOf(key);
            } catch (IllegalArgumentException | NullPointerException e) {
                return false;
            }
        }
        return validateCriteria(criteria);
    }

    /**
     * Refrigerator validation
     * @param criteria
     * @return
     */
    private static boolean validateRefrigerator(Map<String, Object> criteria) {
        for (String key : criteria.keySet()) {
            try {
                SearchCriteria.Refrigerator.valueOf(key);
            } catch (IllegalArgumentException | NullPointerException e) {
                return false;
            }
        }
        return validateCriteria(criteria);
    }

    /**
     * Speakers validation
     * @param criteria
     * @return
     */
    private static boolean validateSpeakers(Map<String, Object> criteria) {
        for (String key : criteria.keySet()) {
            try {
                SearchCriteria.Speakers.valueOf(key);
            } catch (IllegalArgumentException | NullPointerException e) {
                return false;
            }
        }
        return validateCriteria(criteria);
    }

    /**
     * Tablet validation
     * @param criteria
     * @return
     */
    private static boolean validateTablet(Map<String, Object> criteria) {
        for (String key : criteria.keySet()) {
            try {
                SearchCriteria.Tablet.valueOf(key);
            } catch (IllegalArgumentException | NullPointerException e) {
                return false;
            }
        }
        return validateCriteria(criteria);
    }

    /**
     * Cleaner validation
     * @param criteria
     * @return
     */
    private static boolean validateVacuumCleaner(Map<String, Object> criteria) {
        for (String key : criteria.keySet()) {
            try {
                SearchCriteria.VacuumCleaner.valueOf(key);
            } catch (IllegalArgumentException | NullPointerException e) {
                return false;
            }
        }
        return validateCriteria(criteria);
    }

    /**
     * Method validates needed appliance criteria and real criteria for searching
     * @param criteria - all criteria for needed appliance
     * @return result of validation
     */
    private static boolean validateCriteria(Map<String, Object> criteria) {
        for (Map.Entry<String, Object> entry : criteria.entrySet()) {
            if (!validatorMap.get(entry.getKey()).isValid(entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    private static boolean validatePrice(Object value) {
        return simpleDoubleValidate(value);
    }

    private static boolean validatePowerConsumption(Object value) {
        return simpleDoubleValidate(value);
    }

    private static boolean validateWeight(Object value) {
        return simpleDoubleValidate(value);
    }

    private static boolean validateCapacity(Object value) {
        return simpleDoubleValidate(value);
    }


    private static boolean validateHeight(Object value) {
        return simpleDoubleValidate(value);
    }

    private static boolean validateWidth(Object value) {
        return simpleDoubleValidate(value);
    }

    private static boolean validateBatteryCapacity(Object value) {
        return simpleDoubleValidate(value);
    }

    private static boolean validateOS(Object value) {
        return simpleStringValidate(value);
    }

    private static boolean validateCPU(Object value) {
        return simpleStringValidate(value);
    }

    private static boolean validateScreenSize(Object value) {
        return simpleDoubleValidate(value);
    }


    private static boolean validateSpeakersPower(Object value) {
        return simpleIntValidate(value);
    }

    private static boolean validateFrequencyRange(Object value) {
        return simpleStringValidate(value);
    }

    private static boolean validateSpeakersVolume(Object value) {
        return simpleDoubleValidate(value);
    }

    private static boolean validateMemory(Object value) {
        return simpleIntValidate(value);
    }

    private static boolean validateColor(Object value) {
        return simpleStringValidate(value);
    }

    private static boolean validateFilterType(Object value) {
        return simpleStringValidate(value);
    }

    private static boolean validatePower(Object value) {
        return simpleStringValidate(value);
    }


    private static boolean validateConsumption(Object value) {
        return simpleDoubleValidate(value);
    }


    /**
     * Double validation
     * @param value
     * @return
     */
    private static boolean simpleDoubleValidate(Object value) {
        if (value instanceof Double) {
            return (Double) value > 0.0;
        }
        return false;
    }

    /**
     * String validation
     * @param value
     * @return
     */
    private static boolean simpleStringValidate(Object value) {
        if (value instanceof String) {
            return !((String) value).isEmpty();
        }
        return false;
    }

    /**
     * Int validation
     * @param value
     * @return
     */
    private static boolean simpleIntValidate(Object value) {
        if (value instanceof Integer) {
            return (Integer) value > 0;
        }
        return false;
    }
}
