package DesignPattern.SOLID;

public class InvoiceSaveToDB {
    Marker marker;
    int price;

    public InvoiceSaveToDB(Marker marker, int price) {
        this.marker = marker;
        this.price = price;
    }

    public void saveToDB() {
        //we can change this too
    }
}
