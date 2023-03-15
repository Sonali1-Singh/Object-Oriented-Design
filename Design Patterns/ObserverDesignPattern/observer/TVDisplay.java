package ObserverDesignPattern.observer;

import ObserverDesignPattern.observable.Weather;

public class TVDisplay implements Display{
    Weather obj;
    public TVDisplay(Weather obj){
        this.obj =obj;
    }
    @Override
    public void update() {
        int t = this.obj.getTemp();
        System.out.println("TV: Weather temperature--"+t);
    }
}
