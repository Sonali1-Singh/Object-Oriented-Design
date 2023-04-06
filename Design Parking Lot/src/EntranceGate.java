import entity.Ticket;
import entity.Vehicle;
import parking.ParkingSpotFactory;
import parking.parkingSpot.ParkingSpot;
import parking.parkingSpot.TwoWheelerParkingSpot;
import parking.parkingSpotManager.ParkingSpotManager;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public class EntranceGate {
    ParkingSpotFactory spotFactory;
    ParkingSpotManager parkingSpotManager;
    EntranceGate(ParkingSpotFactory factory){
        this.spotFactory = factory;
    }
    Ticket bookSpot(Vehicle vehicle){
        Ticket ticket = null;
        this.parkingSpotManager = this.spotFactory.getParkingSpotManager(vehicle.getType());
        System.out.println("finding space for Vehicle with Vehicle Number: "+vehicle.getVehicleNumber());
        ParkingSpot spot= this.parkingSpotManager.findParkingSpot();
        if(spot!=null){
            System.out.println("Spot "+spot.getSpotId()+" is available for parking....");
            ticket = this.generateTicket(spot,vehicle);
            spot.parkVehicle(vehicle);
            System.out.println("Parked at Parking Spot id: "+spot.getSpotId());
        }else{
            System.out.println("No space available to park vehicle");
        }
        return ticket;
    }
    Ticket generateTicket(ParkingSpot spot,Vehicle vehicle){
        Ticket ticket = new Ticket(new Timestamp(System.currentTimeMillis()),vehicle,spot);
        System.out.println("Generating Ticket.... ");
        System.out.println(ticket.toString());
        return ticket;
    }

}
