package src.models;

public class Villa extends Facility{
    private String roomStandards;
    private String poolAre;
    private int numberFloors;

    public Villa(String serviceName, double usableArea, long rentalCost, int maxPeople, String rentalType) {
        super(serviceName, usableArea, rentalCost, maxPeople, rentalType);
    }

    public Villa(String serviceName, double usableArea, long rentalCost, int maxPeople, String rentalType, String roomStandards, String poolAre, int numberFloors) {
        super(serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.roomStandards = roomStandards;
        this.poolAre = poolAre;
        this.numberFloors = numberFloors;
    }

    public Villa() {
    }

    public Villa(String roomStandards, String poolAre, int numberFloors) {
        this.roomStandards = roomStandards;
        this.poolAre = poolAre;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public String getPoolAre() {
        return poolAre;
    }

    public void setPoolAre(String poolAre) {
        this.poolAre = poolAre;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }
}
