package src.repository.Impl;


import src.models.Facility;
import src.models.House;
import src.models.Room;
import src.models.Villa;
import src.repository.FacilityRepository;

import java.util.LinkedHashMap;

public class FacilityRepositoryImpl implements FacilityRepository {
    private static int usageH = 0;
    private static int usageV = 0;
    private static int usageR = 0;
    static LinkedHashMap<Facility, Integer> facilityMap;

    static {
        facilityMap = new LinkedHashMap<>();
        facilityMap.put(new House(300.5, 300000000, 5, "year", 5, 3), usageH++);
        facilityMap.put(new Villa(250, 1000000, 10, "day", 5, 300, 2), usageV++);
        facilityMap.put(new Room(200, 500000, 2, "month", "water"), usageR++);
    }


    @Override
    public void displayFacility() {
            for(Facility key : facilityMap.keySet()){
                if(facilityMap.get(key)>=5){
                    System.out.println(key+":can duoc bao tri!");
                }
                else {
                    System.out.println(key);
                }
            }
    }

    @Override
    public void addFacility(Facility o) {
        if(o instanceof Villa){
            facilityMap.put(o,usageV++);
        }
        else if(o instanceof House){
            facilityMap.put(o,usageH++);
        }
        else {
            facilityMap.put(o,usageR);
        }
    }


    @Override
    public void displayListMaintenance() {
        for(Facility key : facilityMap.keySet()){
            if(facilityMap.get(key)>=5){
                System.out.println(key+":can duoc bao tri!");
            }
        }
    }


}
