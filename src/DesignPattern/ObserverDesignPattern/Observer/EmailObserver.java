package DesignPattern.ObserverDesignPattern.Observer;

import DesignPattern.ObserverDesignPattern.Observable.Observable;

public class EmailObserver implements Observer {
    Observable observable;
    String email;

    public EmailObserver(Observable observable, String email) {
        this.observable = observable;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Msg sent to " + email);
    }
}
