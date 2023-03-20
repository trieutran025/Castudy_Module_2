package src.repository.Impl;


import src.models.Facility;
import src.models.House;
import src.models.Room;
import src.models.Villa;
import src.repository.FacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepositoryImpl implements FacilityRepository {
    private static int usageH = 0;
    private static int usageV = 0;
    private static int usageR = 0;

   public static Map<Facility,Integer> facilityMap = new LinkedHashMap<>();

    static {
        facilityMap = new LinkedHashMap<>();
        facilityMap.put(new House("SVVL-0001", 300.5, 300000000, 5, "year", 5, 3), usageH++);
        facilityMap.put(new Villa("SVHO-0001", 250, 1000000, 10, "day", 5, 300, 2), usageV++);
        facilityMap.put(new Room("SVRO-0001", 200, 500000, 2, "month", "water"), usageR++);
    }

    @Override
    public Map<Facility, Integer> displayFacility() {
        return facilityMap;
    }

    @Override
    public void addFacility(Facility o) {
        if (o instanceof Villa) {
            facilityMap.put(o, usageV++);
        } else if (o instanceof House) {
            facilityMap.put(o, usageH++);
        } else {
            facilityMap.put(o, usageR);
        }
    }


    @Override
    public void displayListMaintenance() {
        for (Facility key : facilityMap.keySet()) {
            if (facilityMap.get(key) >= 5) {
                System.out.println(key + ":Needs maintenance!");
            }
        }
    }

}
