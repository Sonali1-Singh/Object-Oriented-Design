package costComputation.pricingStrategy;

import entity.Ticket;
import parking.parkingSpot.ParkingSpot;

import java.util.concurrent.TimeUnit;

public class MinutePricingStrategy implements PricingStrategy{
    @Override
    public int price(Ticket ticket,int price) {
        ParkingSpot ps = ticket.getParkingSpot();
        long timeDiff = System.currentTimeMillis()-ticket.getEntryTime().getTime();
        System.out.println("------Minute Pricing Strategy------");
        int diffMinutes = (int) TimeUnit.MILLISECONDS.toMinutes(timeDiff+60000);//convert miliseconds into hours
        return diffMinutes*price;
    }
}
