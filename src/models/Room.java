package src.models;

public class Room extends Facility {
    private String serviceFree;
    public Room(String serviceName, double usableArea, long rentalCost, int maxPeople, String rentalType) {
        super(serviceName, usableArea, rentalCost, maxPeople, rentalType);
    }

    public Room() {
    }

<<<<<<< HEAD
    public Room(String serviceName,double usableArea, long rentalCost, int maxPeople, String rentalType, String serviceFree) {
        super(serviceName, usableArea, rentalCost, maxPeople, rentalType);
=======
    public Room(double usableArea, long rentalCost, int maxPeople, String rentalType, String serviceFree) {
        super("Room", usableArea, rentalCost, maxPeople, rentalType);
>>>>>>> 95880f380a2aa57913c8e3ef4e52b86ac5000745
        this.serviceFree = serviceFree;
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

}
