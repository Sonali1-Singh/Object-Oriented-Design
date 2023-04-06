package parking.parkingSpotManager;

import parking.parkingSpot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{
    public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList);
    }

    @Override
    public void addParkingSpot(ParkingSpot spot) {
        parkingSpotList.add(spot);
    }

    @Override
    public ParkingSpot findParkingSpot() {
       // System.out.println("four wheeler spots size - "+this.parkingSpotList.size());
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
