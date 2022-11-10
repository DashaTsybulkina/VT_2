package entity.criteria;

public class SearchCriteria {
    public enum Appliance {
        PRICE;
    }

    public enum Laptop{
        FIRM, OS, BATTERY, MEMORY, CPU_NAME, SCREEN_SIZE
    }
    public enum Oven{
        FIRM, CONSUMPTION, WEIGHT, CAPACITY, HEIGHT, WIDTH, MAX_DEGREE
    }
    public enum Refrigerator{
        FIRM, CONSUMPTION, WEIGHT, CAPACITY, HEIGHT, WIDTH,
    }
    public enum Speakers{
        FIRM,CONSUMPTION, POWER, FREQUENCY, VOLUME
    }
    public enum Tablet{
        FIRM,BATTERY, SCREEN_SIZE, MEMORY, COLOR
    }
    public enum VacuumCleaner{
        FIRM,CONSUMPTION, FILTER_TYPE, POWER, WEIGHT
    }




    private SearchCriteria() {}
}
