package costComputation.pricingStrategy;

import entity.Ticket;

public interface PricingStrategy {
    int price(Ticket ticket,int price);
}
