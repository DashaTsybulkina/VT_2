package entity.criteria;

public class SearchCriteria {
    public enum Appliance {
        PRICE;
    }

    public enum Laptop{
        BATTERY_CAPACITY, OS, ROM_MEMORY, SYSTEM_MEMORY, CPU, DISPLAY_INCHES
    }

    public enum Oven{
        POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }

    public enum Refrigerator{
        POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
    }

    public enum Speakers{
        POWER_CONSUMPTION, SPEAKERS_NUMBER, FREQUENCY_RANGE, CORD_LENGTH
    }

    public enum VacuumCleaner{
        POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
    }

    public enum TabletPC{
        BATTERY_CAPACITY, DISPLAY_INCHES, ROM_MEMORY, FLASH_MEMORY_CAPACITY, COLOR
    }


    private SearchCriteria() {}
}
