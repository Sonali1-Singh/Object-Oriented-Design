package StrategyDesignPattern;
import StrategyDesignPattern.Strategy.*;
public class SportyVehicle extends BaseVehicle{
   
    public SportyVehicle(){
        super(new SpecialDriveStrategy());
    }
}
