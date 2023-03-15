package ObserverDesignPattern.observer;

import ObserverDesignPattern.observable.Weather;

public class MobileDisplay implements Display{
    String msg;
    Weather obj;
    public MobileDisplay(String msg, Weather obj){
        this.msg = msg;
        this.obj =obj;
    }
    @Override
    public void update() {
        int t = this.obj.getTemp();
        System.out.println(msg+"-- Weather temperature--"+t);
    }
}
