package costComputation;

import costComputation.pricingStrategy.MinutePricingStrategy;
import costComputation.pricingStrategy.PricingStrategy;
import entity.Ticket;

public class FourWheelerCostComputation implements CostComputation{
    PricingStrategy pricingStrategy;
    int price;
    public FourWheelerCostComputation() {
        this.price = 2; //2rs per minute
        this.pricingStrategy = new MinutePricingStrategy();
    }
    @Override
    public int price(Ticket ticket) {
        return pricingStrategy.price(ticket,this.price);
    }
}
