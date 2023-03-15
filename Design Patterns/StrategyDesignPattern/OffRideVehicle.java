package StrategyDesignPattern;
import StrategyDesignPattern.Strategy.*;
public class OffRideVehicle extends BaseVehicle{
    public OffRideVehicle(){
        super(new SpecialDriveStrategy());
    }
    // public void drive(){
       
    // }
}
