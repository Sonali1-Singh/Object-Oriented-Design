package ObserverDesignPattern;

import ObserverDesignPattern.observable.Weather;
import ObserverDesignPattern.observable.WeatherImpl;
import ObserverDesignPattern.observer.Display;
import ObserverDesignPattern.observer.MobileDisplay;
import ObserverDesignPattern.observer.TVDisplay;

public class Client {
    public static void main(String[] args){
        Weather w = new WeatherImpl();
        //If we have observers like send msg on mobile number or send an email then we can pass mobile
        //number or email id while creating observers
        Display observer1 = new MobileDisplay("Updates for Sonali ",w);
        w.add(observer1);
        w.add(new TVDisplay(w));
        w.setTemp(4);
    }
}
