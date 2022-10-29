package service.validation;

import entity.*;
import entity.criteria.*;

import java.util.HashMap;
import java.util.Map;

public class Validator {
    private static final Map<String, CriteriaValidator> validatorMap = new HashMap<>();

    static {
        validatorMap.put(SearchCriteria.Appliance.PRICE.toString(), Validator::validatePrice);

        validatorMap.put(SearchCriteria.Oven.POWER_CONSUMPTION.toString(), Validator::validatePowerConsumption);
        validatorMap.put(SearchCriteria.Oven.WEIGHT.toString(), Validator::validateWeight);
        validatorMap.put(SearchCriteria.Oven.CAPACITY.toString(), Validator::validateCapacity);
        validatorMap.put(SearchCriteria.Oven.DEPTH.toString(), Validator::validateDepth);
        validatorMap.put(SearchCriteria.Oven.HEIGHT.toString(), Validator::validateHeight);
        validatorMap.put(SearchCriteria.Oven.WIDTH.toString(), Validator::validateWidth);

        validatorMap.put(SearchCriteria.Laptop.BATTERY_CAPACITY.toString(), Validator::validateBatteryCapacity);
        validatorMap.put(SearchCriteria.Laptop.CPU.toString(), Validator::validateCPU);
        validatorMap.put(SearchCriteria.Laptop.DISPLAY_INCHES.toString(), Validator::validateDisplayInches);
        validatorMap.put(SearchCriteria.Laptop.OS.toString(), Validator::validateOS);
        validatorMap.put(SearchCriteria.Laptop.ROM_MEMORY.toString(), Validator::validateRomMemory);
        validatorMap.put(SearchCriteria.Laptop.SYSTEM_MEMORY.toString(), Validator::validateSystemMemory);

        validatorMap.put(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString(), Validator::validateFreezerCapacity);
        validatorMap.put(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString(), Validator::validateOverallCapacity);

        validatorMap.put(SearchCriteria.Speakers.SPEAKERS_NUMBER.toString(), Validator::validateSpeakersNumber);
        validatorMap.put(SearchCriteria.Speakers.CORD_LENGTH.toString(), Validator::validateCordLength);
        validatorMap.put(SearchCriteria.Speakers.FREQUENCY_RANGE.toString(), Validator::validateFrequencyRange);

        validatorMap.put(SearchCriteria.TabletPC.COLOR.toString(), Validator::validateColor);
        validatorMap.put(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString(), Validator::validateFlashMemoryCapacity);

        validatorMap.put(SearchCriteria.VacuumCleaner.BAG_TYPE.toString(), Validator::validateBagType);
        validatorMap.put(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(), Validator::validateFilterType);
        validatorMap.put(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString(), Validator::validateCleaningWidth);
        validatorMap.put(SearchCriteria.VacuumCleaner.WAND_TYPE.toString(), Validator::validateWandType);
        validatorMap.put(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString(), Validator::validateMotorSpeedRegulation);
    }

    public static boolean criteriaValidator(Criteria criteria) {
        if (criteria.getGroupSearchName().equals(Oven.class.getSimpleName())) {
            return validateOven(criteria.getCriteria());
        } else if (criteria.getGroupSearchName().equals(Laptop.class.getSimpleName())) {
            return validateLaptop(criteria.getCriteria());
        } else if (criteria.getGroupSearchName().equals(Refrigerator.class.getSimpleName())) {
            return validateRefrigerator(criteria.getCriteria());
        } else if (criteria.getGroupSearchName().equals(TabletPC.class.getSimpleName())) {
            return validateTabletPC(criteria.getCriteria());
        } else if (criteria.getGroupSearchName().equals(Speakers.class.getSimpleName())) {
            return validateSpeakers(criteria.getCriteria());
        } else if (criteria.getGroupSearchName().equals(VacuumCleaner.class.getSimpleName())) {
            return validateVacuumCleaner(criteria.getCriteria());
        }
        return false;
    }

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

    private static boolean validateTabletPC(Map<String, Object> criteria) {
        for (String key : criteria.keySet()) {
            try {
                SearchCriteria.TabletPC.valueOf(key);
            } catch (IllegalArgumentException | NullPointerException e) {
                return false;
            }
        }
        return validateCriteria(criteria);
    }

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

    private static boolean validateDepth(Object value) {
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

    private static boolean validateRomMemory(Object value) {
        return simpleIntValidate(value);
    }

    private static boolean validateSystemMemory(Object value) {
        return simpleIntValidate(value);
    }

    private static boolean validateCPU(Object value) {
        return simpleStringValidate(value);
    }

    private static boolean validateDisplayInches(Object value) {
        return simpleDoubleValidate(value);
    }

    private static boolean validateFreezerCapacity(Object value) {
        return simpleDoubleValidate(value);
    }

    private static boolean validateOverallCapacity(Object value) {
        return simpleDoubleValidate(value);
    }

    private static boolean validateSpeakersNumber(Object value) {
        return simpleIntValidate(value);
    }

    private static boolean validateFrequencyRange(Object value) {
        return simpleStringValidate(value);
    }

    private static boolean validateCordLength(Object value) {
        return simpleDoubleValidate(value);
    }

    private static boolean validateFlashMemoryCapacity(Object value) {
        return simpleIntValidate(value);
    }

    private static boolean validateColor(Object value) {
        return simpleStringValidate(value);
    }

    private static boolean validateFilterType(Object value) {
        return simpleStringValidate(value);
    }

    private static boolean validateBagType(Object value) {
        return simpleStringValidate(value);
    }

    private static boolean validateWandType(Object value) {
        return simpleStringValidate(value);
    }

    private static boolean validateMotorSpeedRegulation(Object value) {
        return simpleIntValidate(value);
    }

    private static boolean validateCleaningWidth(Object value) {
        return simpleDoubleValidate(value);
    }

    private static boolean simpleDoubleValidate(Object value) {
        if (value instanceof Double) {
            return (Double) value > 0.0;
        }
        return false;
    }

    private static boolean simpleStringValidate(Object value) {
        if (value instanceof String) {
            return !((String) value).isEmpty();
        }
        return false;
    }

    private static boolean simpleIntValidate(Object value) {
        if (value instanceof Integer) {
            return (Integer) value > 0;
        }
        return false;
    }
}
