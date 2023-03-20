package src.models;

public class House extends Facility{
    private int roomStandards;
    private int numberFloors;

    public House( String serviceName,double usableArea, long rentalCost, int maxPeople, String rentalType) {
        super(serviceName, usableArea, rentalCost, maxPeople, rentalType);
    }

    public House(String serviceName ,double usableArea, long rentalCost, int maxPeople, String rentalType, int roomStandards, int numberFloors) {
        super(serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.roomStandards=roomStandards;
        this.numberFloors=numberFloors;
    }

    public House() {
    }


    public House(int roomStandards, int numberFloors) {
        this.roomStandards = roomStandards;
        this.numberFloors = numberFloors;
    }

    public int getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(int roomStandards) {
        this.roomStandards = roomStandards;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }
}
