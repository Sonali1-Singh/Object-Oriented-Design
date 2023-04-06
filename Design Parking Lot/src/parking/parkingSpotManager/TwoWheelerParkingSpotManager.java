package parking.parkingSpotManager;

import parking.parkingSpot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{

    public TwoWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList);
    }

    @Override
    public void addParkingSpot(ParkingSpot spot) {
        this.parkingSpotList.add(spot);
        //System.out.println("spotList size - "+this.parkingSpotList.size());
    }

    @Override
    public ParkingSpot findParkingSpot() {
       // System.out.println("two wheeler spotList size - "+this.parkingSpotList.size());
        for(ParkingSpot ps: parkingSpotList){
            if(ps.getIsEmpty())return ps;
        }
        return null;
    }

    @Override
    public List<ParkingSpot> getParkingSpots() {
        return this.parkingSpotList;
    }
}
