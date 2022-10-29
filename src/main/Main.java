package main;

import entity.Appliance;
import entity.criteria.Criteria;
import entity.criteria.SearchCriteria;
import service.ApplianceService;
import service.ServiceFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        Criteria criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());
        List<Appliance> ovenList = service.find(criteriaOven);
        ApplianceInfoPrinter.print(ovenList);
        System.out.println("------------------------");

        Criteria criteriaRefrigerator = new Criteria(SearchCriteria.Refrigerator.class.getSimpleName());
        Appliance cheapestRefrigerator = service.findTheCheapest(criteriaRefrigerator);
        ApplianceInfoPrinter.print(cheapestRefrigerator);
        System.out.println("------------------------");

        Criteria criteriaLaptop = new Criteria(SearchCriteria.Laptop.class.getSimpleName());
        criteriaLaptop.add(SearchCriteria.Laptop.OS.toString(), "Linux");
        criteriaLaptop.add(SearchCriteria.Laptop.DISPLAY_INCHES.toString(), 15.5);
        List<Appliance> laptopList = service.find(criteriaLaptop);
        ApplianceInfoPrinter.print(laptopList);
        System.out.println("------------------------");

        Criteria criteriaTabletPC = new Criteria(SearchCriteria.TabletPC.class.getSimpleName());
        criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 10.0);
        List<Appliance> tabletList = service.find(criteriaTabletPC);
        ApplianceInfoPrinter.print(tabletList);
        System.out.println("------------------------");

        Criteria criteriaVacuumCleaner = new Criteria(SearchCriteria.VacuumCleaner.class.getSimpleName());
        criteriaVacuumCleaner.add(SearchCriteria.Oven.WIDTH.toString(), 12.0);
        List<Appliance> vacuumList = service.find(criteriaVacuumCleaner);
        ApplianceInfoPrinter.print(vacuumList);
        System.out.println("------------------------");
    }
}