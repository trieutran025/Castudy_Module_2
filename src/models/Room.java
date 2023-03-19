package src.models;

public class Room extends Facility {
    private String serviceFree;
    public Room(String serviceName, double usableArea, long rentalCost, int maxPeople, String rentalType) {
        super(serviceName, usableArea, rentalCost, maxPeople, rentalType);
    }

    public Room() {
    }

    public Room(String serviceName,double usableArea, long rentalCost, int maxPeople, String rentalType, String serviceFree) {
        super(serviceName, usableArea, rentalCost, maxPeople, rentalType);
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
