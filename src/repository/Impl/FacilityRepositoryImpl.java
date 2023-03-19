package src.repository.Impl;


import src.models.Facility;
import src.models.House;
import src.models.Room;
import src.models.Villa;
import src.repository.FacilityRepository;

import java.util.LinkedHashMap;
<<<<<<< HEAD
import java.util.Map;
=======
import java.util.Set;
>>>>>>> 95880f380a2aa57913c8e3ef4e52b86ac5000745

public class FacilityRepositoryImpl implements FacilityRepository {
    private static int usageH = 0;
    private static int usageV = 0;
    private static int usageR = 0;
<<<<<<< HEAD
=======
    private static int usageD = 0;
>>>>>>> 95880f380a2aa57913c8e3ef4e52b86ac5000745
    static LinkedHashMap<Facility, Integer> facilityMap;

    static {
        facilityMap = new LinkedHashMap<>();
<<<<<<< HEAD
        facilityMap.put(new House("SVVL-0001", 300.5, 300000000, 5, "year", 5, 3), usageH++);
        facilityMap.put(new Villa("SVHO-0001",250, 1000000, 10, "day", 5, 300, 2), usageV++);
        facilityMap.put(new Room("SVRO-0001",200, 500000, 2, "month", "water"), usageR++);
    }


    @Override
    public Map<Facility, Integer> displayFacility() {
        return facilityMap;
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
                System.out.println(key+":Needs maintenance!");
            }
        }
    }


=======
        facilityMap.put(new House(300.5, 300000000, 5, "year", 5, 3), usageH++);
        facilityMap.put(new Villa(250, 1000000, 10, "day", 5, 300, 2), usageV++);
        facilityMap.put(new Room(200, 500000, 2, "month", "water"), usageR++);
    }

    @Override
    public Set<Facility> displayFacility() {
        return facilityMap.keySet();
    }

    @Override
    public void addNewHouse(Facility o) {
        if (usageH >= 5) {
            System.out.println("He thong can bao tri!");
        } else facilityMap.put(o, usageH++);
    }

    @Override
    public void addNewVilla(Facility o) {
        if (usageV >= 5) {
            System.out.println("He thong can bao tri!");
        } else facilityMap.put(o, usageV++);
    }

    @Override
    public void addNewRoom(Facility o) {
        if (usageR >= 5) {
            facilityMap.get(o);
            System.out.println("He thong can bao tri!");
        } else facilityMap.put(o, usageR++);
    }

    @Override
    public void displayFacilityMaintenance() {
        for (Facility key : facilityMap.keySet()) {
            if (facilityMap.get(key) >= 5) {
                System.out.println(key + ":can duoc bao tri!");
            }
        }
    }
>>>>>>> 95880f380a2aa57913c8e3ef4e52b86ac5000745
}
