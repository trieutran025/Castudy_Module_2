package src.service;


import src.models.Facility;

public interface FacilityService extends Service {
    void displayFacility();

    void addFacility(Facility o);

     void displayListMaintenance();
}
