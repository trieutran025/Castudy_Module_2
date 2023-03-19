package src.service;

import src.models.Facility;
import src.repository.FacilityRepository;
import src.repository.Impl.FacilityRepositoryImpl;


import java.util.Set;
<<<<<<< HEAD
import java.util.TreeMap;
=======
>>>>>>> 95880f380a2aa57913c8e3ef4e52b86ac5000745

public class FacilityServiceImpl implements FacilityService {
    private FacilityRepository repository =(FacilityRepository) new FacilityRepositoryImpl();

<<<<<<< HEAD

    @Override
    public void displayFacility() {
        repository.displayFacility();
    }

    @Override
    public void addFacility(Facility o) {
        repository.addFacility(o);
=======
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
>>>>>>> 95880f380a2aa57913c8e3ef4e52b86ac5000745
    }



    @Override
<<<<<<< HEAD
    public void displayListMaintenance() {
        repository.displayListMaintenance();
    }

=======
    public void displayFacilityMaintenance() {
        repository.displayFacilityMaintenance();
    }
>>>>>>> 95880f380a2aa57913c8e3ef4e52b86ac5000745
}
