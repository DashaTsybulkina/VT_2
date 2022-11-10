package service;

import service.impl.ApplianceSearchingServiceImpl;

/**
 * Singleton for ApplianceSearchingService
 */
public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final ApplianceService applianceService = new ApplianceSearchingServiceImpl();

    /**
     * Private constructor to have no possibilities to create object of class
     */
    private ServiceFactory() {}

    public ApplianceService getApplianceService() {
        return applianceService;
    }

    public static ServiceFactory getInstance() {
        return instance;
    }
}
