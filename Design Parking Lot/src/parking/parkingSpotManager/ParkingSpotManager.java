package parking.parkingSpotManager;

import parking.parkingSpot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public abstract class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList=new ArrayList<>();
    public ParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public ParkingSpot findParkingSpace(){
        return null;
    }
    public abstract void addParkingSpot(ParkingSpot spot);
    public abstract ParkingSpot findParkingSpot();
    public abstract List<ParkingSpot> getParkingSpots();
    void removeParkingSpot(){
    }
}
