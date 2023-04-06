package costComputation;

import costComputation.pricingStrategy.PricingStrategy;
import entity.Ticket;

public interface CostComputation {
    public int price(Ticket ticket);
}
