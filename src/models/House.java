package src.models;

public class House extends Facility {
    private String roomStandards;
    private int numberFloors;


    public House(String serviceID, String serviceName, double usableArea, long rentalCost, int maxPeople, String rentalType, String roomStandards, int numberFloors) {
        super(serviceID, serviceName, usableArea, rentalCost, maxPeople, rentalType);
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

    @Override
    public String toString() {
        return super.toString() +
                "roomStandards=" + roomStandards +
                ", numberFloors=" + numberFloors +
                '}';
    }

    @Override
    public int compareTo(Facility o) {
        return 0;
    }
}
