import entity.Ticket;
import entity.Vehicle;
import entity.VehicleType;
import parking.ParkingSpotFactory;
import parking.parkingSpot.FourWheelerParkingSpot;
import parking.parkingSpot.ParkingSpot;
import parking.parkingSpot.TwoWheelerParkingSpot;
import parking.parkingSpotManager.ParkingSpotManager;
import parking.parkingSpotManager.TwoWheelerParkingSpotManager;

public class Main {
    public static void main(String[] args) {
        //Add n 2wheeler and m 4wheeler parking spots
        ParkingSpotFactory parkingSpotFactory = new ParkingSpotFactory(1,5);
        Vehicle v1 = new Vehicle("UP35X8449", VehicleType.TwoWheeler);
        Vehicle v2 = new Vehicle("UP35X2052", VehicleType.FourWheeler);
        EntranceGate entranceGate = new EntranceGate(parkingSpotFactory);
        Ticket t1 = entranceGate.bookSpot(v1);
        Ticket t2 = entranceGate.bookSpot(v2);
        ExitGate exitGate = new ExitGate();
        exitGate.doExit(t1);
        exitGate.doExit(t2);
        //Ticket t2 = entranceGate.bookSpot(v);
        //parkingSpotFactory.addTwoWheelerSpots(5);
    }
}