package src.models;

public class Villa extends Facility{
    private int roomStandards;
    private double poolAre;
    private int numberFloors;


    public Villa(String serviceID, String serviceName, double usableArea, long rentalCost, int maxPeople, String rentalType, int roomStandards, double poolAre, int numberFloors) {
        super(serviceID, serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.roomStandards = roomStandards;
        this.poolAre = poolAre;
        this.numberFloors = numberFloors;
    }

    public Villa(String serviceID, String serviceName, long rentalCost, int maxPeople, String rentalType, int roomStandards, double poolArea, int numberFloors) {
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

    @Override
    public String toString() {
        return "Villa{" +
                super.toString()+
                "roomStandards=" + roomStandards +
                ", poolAre=" + poolAre +
                ", numberFloors=" + numberFloors +
                '}';
    }
}
