package by.itstep.aniskovich.java.stage17.lunchdelivery.model.logic;

import java.util.HashMap;
import java.util.Map;

public class ProductionService {
    private Map<String, ManagerService> productionManagers;

    public ProductionService() {
        this.productionManagers = new HashMap<>();
    }

    public void addProduction(String productionName, ManagerService managerService) {
        productionManagers.put(productionName, managerService);
    }

    public ManagerService getProductionManager(String productionName) {
        return productionManagers.get(productionName);
    }
}

