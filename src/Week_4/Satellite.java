package Week_4;

import java.util.ArrayList;

public class Satellite implements Observable {
    private static Satellite INSTANCE;
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public static Satellite getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Satellite();
        }
        return INSTANCE;
    }
    
    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
