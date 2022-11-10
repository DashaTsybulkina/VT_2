package main;

import entity.Appliance;

import java.util.List;

public class InfoPrinter {

    /**
     * Overloaded method for all appliances output
     * @param appliances
     */
    public static void printInfo(List<Appliance> appliances) {
        if (appliances == null) {
            System.out.println("Wrong criteria was found");
            return;
        }
        if (appliances.isEmpty()) {
            System.out.println("Nothing was found");
            return;
        }

        for (Appliance appliance : appliances) {
            System.out.println(appliance);
        }
    }

    /**
     * Overloaded method for appliance output
     * @param appliance
     */
    public static void printInfo(Appliance appliance) {
        if (appliance == null) {
            System.out.println("Nothing found");
            return;
        }

        System.out.println(appliance);
    }
}
