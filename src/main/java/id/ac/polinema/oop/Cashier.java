package id.ac.polinema.oop;

public class Cashier {
    public double calculateChange(Order order, double cash){
        double total = 0;
        if (order != null) {
            total = order.getFinalTotal();
        }
        return cash - total;
    }
}
