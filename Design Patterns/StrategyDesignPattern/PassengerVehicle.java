package StrategyDesignPattern;
import StrategyDesignPattern.Strategy.*;
public class PassengerVehicle extends BaseVehicle{
    public PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
