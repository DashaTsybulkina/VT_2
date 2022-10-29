package main;

import entity.Appliance;

import java.util.List;

public class ApplianceInfoPrinter {
    public static void print(List<Appliance> appliances) {
        if (appliances == null) {
            System.out.println("Wrong criteria or other problems");
            return;
        }
        if (appliances.isEmpty()) {
            System.out.println("Nothing found");
            return;
        }
        for (Appliance appliance : appliances) {
            System.out.println(appliance);
        }
    }

    public static void print(Appliance appliance) {
        if (appliance == null) {
            System.out.println("Nothing found");
            return;
        }
        System.out.println(appliance);
    }
}
