package main;

import entity.Appliance;
import entity.criteria.Criteria;
import entity.criteria.SearchCriteria;
import service.ApplianceService;
import service.ServiceFactory;

import java.util.List;

/**
 * @author DaryaTsybulkina
 * @version  1.0
 */

public class Main {
    /**
     * Starting point of application
     * @param args
     */
    public static void main(String[] args) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ApplianceService service = serviceFactory.getApplianceService();

        Criteria ovenInfo = new Criteria(SearchCriteria.Oven.class.getSimpleName());
        List<Appliance> ovens = service.findApplianceByCriteria(ovenInfo);
        InfoPrinter.printInfo(ovens);
        System.out.println("------------------------");

        Criteria refrigeratorInfo = new Criteria(SearchCriteria.Refrigerator.class.getSimpleName());
        Appliance cheapestRefrigerator = service.findCheapestAppliance(refrigeratorInfo);
        InfoPrinter.printInfo(cheapestRefrigerator);
        System.out.println("------------------------");

        Criteria laptopInfo = new Criteria(SearchCriteria.Laptop.class.getSimpleName());
        //laptopInfo.addCriteria(SearchCriteria.Laptop.FIRM.toString(), "LENOVO"); //пока так нельзя
        laptopInfo.addCriteria(SearchCriteria.Laptop.OS.toString(), "Linux");
        //laptopInfo.addCriteria(SearchCriteria.Laptop.BATTERY.toString(), 1.5);
        //laptopInfo.addCriteria(SearchCriteria.Laptop.SCREEN_SIZE.toString(), 15.5);
        //laptopInfo.addCriteria(SearchCriteria.Laptop.MEMORY.toString(), 512);
        //laptopInfo.addCriteria(SearchCriteria.Laptop.CPU_NAME.toString(), "Intel Core i7");
        List<Appliance> laptops = service.findApplianceByCriteria(laptopInfo);
        InfoPrinter.printInfo(laptops);
        System.out.println("------------------------");

        Criteria tabletInfo = new Criteria(SearchCriteria.Tablet.class.getSimpleName());
        tabletInfo.addCriteria(SearchCriteria.Tablet.SCREEN_SIZE.toString(), 15.0);
        List<Appliance> tablets = service.findApplianceByCriteria(tabletInfo);
        InfoPrinter.printInfo(tablets);
        System.out.println("------------------------");

        Criteria vacuumCleanerInfo = new Criteria(SearchCriteria.VacuumCleaner.class.getSimpleName());
        vacuumCleanerInfo.addCriteria(SearchCriteria.Oven.WIDTH.toString(), 12.0); //здесь духовка, а не пылесос
        List<Appliance> cleaners = service.findApplianceByCriteria(vacuumCleanerInfo);
        InfoPrinter.printInfo(cleaners);
        System.out.println("------------------------");
    }
}