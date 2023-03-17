package src.service;

import src.models.Facility;
import src.repository.FacilityRepository;
import src.repository.Impl.FacilityRepositoryImpl;


import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    private FacilityRepository repository =(FacilityRepository) new FacilityRepositoryImpl();

    @Override
    public Set<Facility> displayFacility() {
        return repository.displayFacility();
    }

    @Override
    public void addNewHouse(Facility o) {
        repository.addNewHouse(o);
    }

    @Override
    public void addNewVilla(Facility o) {
        repository.addNewVilla(o);
    }

    @Override
    public void addNewRoom(Facility o) {
        repository.addNewRoom(o);
    }



    @Override
    public void displayFacilityMaintenance() {
        repository.displayFacilityMaintenance();
    }
}
