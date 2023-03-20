package src.service;

import src.models.Facility;
import src.repository.FacilityRepository;
import src.repository.Impl.FacilityRepositoryImpl;


import java.util.Set;
import java.util.TreeMap;

public class FacilityServiceImpl implements FacilityService {
    private FacilityRepository repository =(FacilityRepository) new FacilityRepositoryImpl();
    @Override
    public void displayFacility() {
        repository.displayFacility();
    }

    @Override
    public void addFacility(Facility o) {
        repository.addFacility(o);
    }

    @Override
    public void displayListMaintenance() {
        repository.displayListMaintenance();
    }
}
