package src.repository;

import src.models.Facility;

<<<<<<< HEAD
import java.util.Map;

public interface FacilityRepository {
    Map<Facility,Integer> displayFacility();

   void addFacility(Facility o);

     void displayListMaintenance();
=======
import java.util.Set;

public interface FacilityRepository {
    Set<Facility> displayFacility();

    void addNewHouse(Facility o);
    void addNewVilla(Facility o);
    void addNewRoom(Facility o);

    void displayFacilityMaintenance();
>>>>>>> 95880f380a2aa57913c8e3ef4e52b86ac5000745
}
