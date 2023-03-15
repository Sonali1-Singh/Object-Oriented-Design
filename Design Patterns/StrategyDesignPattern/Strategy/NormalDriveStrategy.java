package StrategyDesignPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    // public NormalDriveStrategy(){

    // }
    @Override
    public int drive(){
        return 60;
    }
}
