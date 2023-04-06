package costComputation.pricingStrategy;

import entity.Ticket;
import parking.parkingSpot.ParkingSpot;

import java.util.concurrent.TimeUnit;

public class HourlyPricingStrategy implements PricingStrategy{
    @Override
    public int price(Ticket ticket,int price) {
        ParkingSpot ps = ticket.getParkingSpot();
        long timeDiff = System.currentTimeMillis()-ticket.getEntryTime().getTime();
        System.out.println("-------Hourly Pricing Strategy-------");
        int diffHours = (int) TimeUnit.MILLISECONDS.toHours(timeDiff+3600000);//convert miliseconds into hours
        return diffHours*price;
    }
}
