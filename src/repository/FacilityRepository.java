package src.repository;

import src.models.Facility;

import java.util.Map;

public interface FacilityRepository {
    Map<Facility, Integer> displayFacility();

   void addFacility(Facility o);

     void displayListMaintenance();

}
