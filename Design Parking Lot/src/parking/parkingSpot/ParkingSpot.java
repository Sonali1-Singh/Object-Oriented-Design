package parking.parkingSpot;

import entity.Vehicle;

public abstract class ParkingSpot {
    int spotId;
    boolean isEmpty;
    Vehicle vehicle;

    public ParkingSpot(int spotId) {
        this.isEmpty = true;
        this.vehicle = null;
        this.spotId = spotId;
    }
    public void parkVehicle(Vehicle v){
        this.isEmpty = false;
        this.vehicle = v;
    }
    public void removeVehicle(){
        this.isEmpty = true;
        this.vehicle = null;
    };

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public boolean getIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean empty) {
        isEmpty = empty;
    }
}
