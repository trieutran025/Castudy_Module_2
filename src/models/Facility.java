package src.models;

import java.util.Objects;

public abstract class Facility implements Comparable<Facility> {
    private String serviceID;
    private String serviceName;
    private double usableArea;
    private long rentalCost;
    private int maxPeople;
    private String rentalType;

    public Facility(String serviceID, String serviceName, double usableArea, long rentalCost, int maxPeople, String rentalType) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public Facility() {
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public long getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(long rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Facility)) return false;
        Facility facility = (Facility) o;
        return Double.compare(facility.getUsableArea(), getUsableArea()) == 0 && getRentalCost() == facility.getRentalCost() && getMaxPeople() == facility.getMaxPeople() && getServiceID().equals(facility.getServiceID()) && getServiceName().equals(facility.getServiceName()) && Objects.equals(getRentalType(), facility.getRentalType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getServiceID(), getServiceName(), getUsableArea(), getRentalCost(), getMaxPeople(), getRentalType());
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceID='" + serviceID + '\'' +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxPeople=" + maxPeople +
                ", rentalType='" + rentalType + '\'';
    }
}
