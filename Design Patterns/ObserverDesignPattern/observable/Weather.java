package ObserverDesignPattern.observable;

import ObserverDesignPattern.observer.Display;
//we can use this as common observable for weather, gold price, stock exch updates as well
public interface Weather {
    void add(Display obj);
    void remove(Display obj);
    void notifyAllDisplay();
    void setTemp(int temp);
    int getTemp();
}
