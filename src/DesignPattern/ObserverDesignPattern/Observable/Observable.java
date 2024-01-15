package DesignPattern.ObserverDesignPattern.Observable;

import DesignPattern.ObserverDesignPattern.Observer.Observer;

public interface Observable {

    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifyOthers();
    public void setStockCount(int x);
    public void getStockCount();
}
