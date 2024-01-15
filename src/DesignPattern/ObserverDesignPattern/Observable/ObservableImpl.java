package DesignPattern.ObserverDesignPattern.Observable;

import DesignPattern.ObserverDesignPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements  Observable{
    List<Observer> observerList = new ArrayList<>();
    int stockCount = 0;
    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyOthers() {
        for(Observer ob : observerList) {
            ob.update();
        }
    }

    @Override
    public void setStockCount(int x) {
        if( x  == 0){
            notifyOthers();
        }
        stockCount += x;

    }

    @Override
    public void getStockCount() {
        System.out.println(stockCount);
    }
}
