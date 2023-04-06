package costComputation;

import costComputation.pricingStrategy.HourlyPricingStrategy;
import costComputation.pricingStrategy.MinutePricingStrategy;
import costComputation.pricingStrategy.PricingStrategy;
import entity.Ticket;

public class TwoWheelerCostComputation implements CostComputation{
    PricingStrategy pricingStrategy;
    int price;
    public TwoWheelerCostComputation() {
        this.price = 40; //40rs per hour
        this.pricingStrategy = new HourlyPricingStrategy();
    }
    @Override
    public int price(Ticket ticket) {
        return pricingStrategy.price(ticket,this.price);
    }
}
