import costComputation.CostComputation;
import costComputation.CostComputationFactory;
import entity.Ticket;
import parking.parkingSpot.ParkingSpot;

import java.sql.Timestamp;
import java.util.Date;

public class ExitGate {
    Ticket ticket;
    int price;
    public void doExit(Ticket t) {
        this.ticket = t;
        ParkingSpot spot = this.ticket.getParkingSpot();
        spot.removeVehicle();
        //this.price = spot.getPrice();
        this.price = this.calculateCost();
        this.makePayment();
        System.out.println("Parking Spot with id:"+spot.getSpotId()+" is free now.");
    }
    public int calculateCost(){
        CostComputationFactory factory = new CostComputationFactory();
        CostComputation costComputation = factory.getCostComputation(this.ticket.getVehicle().getType());

        return costComputation.price(this.ticket);
//        long duration = System.currentTimeMillis()-this.ticket.getEntryTime().getTime();
//        int minutes = (int) (duration/3600); //convert miliseconds into minutes
//        //minutes+=62; //if after 62minutes doing exit
//        System.out.println("duration "+minutes);
//        return this.price+((minutes>60)?minutes-60: 0);//if duration is more than 1hr, add fine
    }
    public void makePayment(){
        System.out.println("Pay Amout - "+this.price+"Rs.");
        System.out.println("Successfully Payment done.");
    }
}
