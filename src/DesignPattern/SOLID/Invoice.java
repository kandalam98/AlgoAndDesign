package DesignPattern.SOLID;

public class Invoice {
    Marker marker;
    int price;
    //S - Single Responsibility

    public Invoice(Marker marker, int price) {
        this.marker = marker;
        this.price = price;
    }

    public int saveInvoice(Marker marker , int price){
        return marker.getQuantity() *  price;
        //if we want to add GST , the we need to modify again .
    }
    public void saveToDB() {
        //we can change this too
    }
    public void printInvoice() {
        //we can change this too
    }
    //totally we need to change 3 methods. which violates S rule.
    //A class should have only one reason to change
}
