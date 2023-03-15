package StrategyDesignPattern;
import StrategyDesignPattern.Strategy.*;
public class BaseVehicle {
    public int speed;
    DriveStrategy drive;
    public BaseVehicle(DriveStrategy d){
        this.drive = d;
    }
    public void drive(){
       this.speed = this.drive.drive();
    }
}
