package parking;

import entity.VehicleType;
import parking.parkingSpot.FourWheelerParkingSpot;
import parking.parkingSpot.ParkingSpot;
import parking.parkingSpot.TwoWheelerParkingSpot;
import parking.parkingSpotManager.FourWheelerParkingSpotManager;
import parking.parkingSpotManager.ParkingSpotManager;
import parking.parkingSpotManager.TwoWheelerParkingSpotManager;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotFactory {
    ParkingSpotManager twoWheelerSpotsManager, fourWheelerSpotsManager;
    List<ParkingSpot> twoWheelerSpots, fourWheelerSpots;
    public ParkingSpotFactory(int n, int m) {
        this.twoWheelerSpots = new ArrayList<>();
        this.fourWheelerSpots = new ArrayList<>();
        for(int i=1;i<=n;i++){
            ParkingSpot p = new TwoWheelerParkingSpot(i);
            this.twoWheelerSpots.add(p);
        }
        for(int i=1;i<=m;i++){
            ParkingSpot p = new FourWheelerParkingSpot(i);
            this.fourWheelerSpots.add(p);
        }
        this.twoWheelerSpotsManager = new TwoWheelerParkingSpotManager(this.twoWheelerSpots);
        this.fourWheelerSpotsManager = new FourWheelerParkingSpotManager(this.fourWheelerSpots);
    }
    public void addTwoWheelerSpots(int n){
        int count = this.twoWheelerSpotsManager.getParkingSpots().size();
        for(int i=1;i<=n;i++){
            ParkingSpot p = new TwoWheelerParkingSpot(count+i);
            this.twoWheelerSpotsManager.addParkingSpot(p);
        }
    }
    public void addFourWheelerSpots(int n){
        int count = this.fourWheelerSpotsManager.getParkingSpots().size();
        for(int i=1;i<=n;i++){
            ParkingSpot p = new FourWheelerParkingSpot(count+i);
            this.fourWheelerSpotsManager.addParkingSpot(p);
        }
    }
    public ParkingSpotManager getParkingSpotManager(VehicleType type){
        switch(type){
            case TwoWheeler:
                return this.twoWheelerSpotsManager;
            case FourWheeler:
                return this.fourWheelerSpotsManager;
        }
        return null;
    }
}
