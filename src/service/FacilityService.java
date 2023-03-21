package src.service;


import src.models.Facility;

import java.util.Map;

public interface FacilityService extends Service {
    Map<Facility, Integer> displayFacility();

    void addFacility(Facility o);

     void displayListMaintenance();

}
