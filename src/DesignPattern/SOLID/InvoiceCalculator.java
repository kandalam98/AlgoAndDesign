package DesignPattern.SOLID;

public class InvoiceCalculator {
    Marker marker;
    int price;

    public InvoiceCalculator(Marker marker, int price) {
        this.marker = marker;
        this.price = price;
    }

    public int saveInvoice(Marker marker , int price){
        return marker.getQuantity() *  price;
       // we can change this when ever we want
    }
}
