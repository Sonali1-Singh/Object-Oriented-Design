package costComputation;

import entity.Ticket;
import entity.VehicleType;
import parking.parkingSpotManager.ParkingSpotManager;

public class CostComputationFactory {
    public CostComputation getCostComputation(VehicleType type){
        switch(type){
            case TwoWheeler:
                return new TwoWheelerCostComputation();
            case FourWheeler:
                return new FourWheelerCostComputation();
        }
        return null;
    }
}
