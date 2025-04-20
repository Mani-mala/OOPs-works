public class Interface {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        p1.makePayment(3000);
        p2.makePayment(5900);
    }
}
interface Payment {
    void makePayment(double amount);
}

class UPI implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI.");
    }
}

class CreditCard implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card.");
    }
}

