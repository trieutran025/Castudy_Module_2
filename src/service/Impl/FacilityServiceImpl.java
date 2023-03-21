package src.service;

import src.models.Facility;
import src.repository.FacilityRepository;
import src.repository.Impl.FacilityRepositoryImpl;


import java.util.Map;

public class FacilityServiceImpl implements FacilityService {
    private FacilityRepository repository =(FacilityRepository) new FacilityRepositoryImpl();
    @Override
    public Map<Facility, Integer> displayFacility() {
        return repository.displayFacility();
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
