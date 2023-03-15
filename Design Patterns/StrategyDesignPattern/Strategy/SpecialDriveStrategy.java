package StrategyDesignPattern.Strategy;

public class SpecialDriveStrategy implements DriveStrategy{
    // public SpecialDriveStrategy(){

    // }
    @Override
    public int drive(){
        return 100;
    }
}
