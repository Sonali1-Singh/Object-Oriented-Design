package StrategyDesignPattern;
public class Client {
    public static void main(String[] args){
        BaseVehicle v = new PassengerVehicle();
        v.drive();
        System.out.println("speed = "+v.speed);
    }
}
