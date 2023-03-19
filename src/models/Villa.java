package src.models;

public class Villa extends Facility{
    private int roomStandards;
    private double poolAre;
    private int numberFloors;

    public Villa(String serviceName, double usableArea, long rentalCost, int maxPeople, String rentalType) {
        super(serviceName, usableArea, rentalCost, maxPeople, rentalType);
    }

<<<<<<< HEAD
    public Villa(String serviceName,double usableArea, long rentalCost, int maxPeople, String rentalType, int roomStandards, double poolAre, int numberFloors) {
        super(serviceName, usableArea, rentalCost, maxPeople, rentalType);
=======
    public Villa(double usableArea, long rentalCost, int maxPeople, String rentalType, int roomStandards, double poolAre, int numberFloors) {
        super("Villa", usableArea, rentalCost, maxPeople, rentalType);
>>>>>>> 95880f380a2aa57913c8e3ef4e52b86ac5000745
        this.roomStandards = roomStandards;
        this.poolAre = poolAre;
        this.numberFloors = numberFloors;
    }

    public Villa() {
    }

    public Villa(int roomStandards, double poolAre, int numberFloors) {
        this.roomStandards = roomStandards;
        this.poolAre = poolAre;
        this.numberFloors = numberFloors;
    }

    public int getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(int roomStandards) {
        this.roomStandards = roomStandards;
    }

    public double getPoolAre() {
        return poolAre;
    }

    public void setPoolAre(double poolAre) {
        this.poolAre = poolAre;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }
}
