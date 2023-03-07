package src.models;

public class House extends Facility{
    private String roomStandards;
    private int numberFloors;

    public House(String serviceName, double usableArea, long rentalCost, int maxPeople, String rentalType) {
        super(serviceName, usableArea, rentalCost, maxPeople, rentalType);
    }

    public House(String serviceName, double usableArea, long rentalCost, int maxPeople, String rentalType, String roomStandards, int numberFloors) {
        super(serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.roomStandards = roomStandards;
        this.numberFloors = numberFloors;
    }

    public House() {
    }

    public House(String roomStandards, int numberFloors) {
        this.roomStandards = roomStandards;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }
}
