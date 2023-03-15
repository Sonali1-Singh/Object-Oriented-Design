package ObserverDesignPattern.observable;

import ObserverDesignPattern.observer.Display;

import java.util.ArrayList;
import java.util.List;

public class WeatherImpl implements Weather{
    List<Display> displayList = new ArrayList<>();
    private int temp;

    @Override
    public void add(Display obj) {
        this.displayList.add(obj);
    }

    @Override
    public void remove(Display obj) {
        this.displayList.remove(obj);
    }

    @Override
    public void notifyAllDisplay() {
        for(Display d: this.displayList){
            d.update();
        }
    }

    @Override
    public void setTemp(int temp) {
        this.temp = temp;
        notifyAllDisplay();
    }

    @Override
    public int getTemp() {
        return this.temp;
    }
}
