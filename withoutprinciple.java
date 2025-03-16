
public class withoutprinciple {
    public static void main(String[] args) {
        Order order = new Order();
        order.placeOrder();
    }
}

class Payment {
    void processPayment() {
        System.out.println("Processing Payment...");
    }
}

class Invoice {
    void generateInvoice() {
        System.out.println("Generating Invoice...");
    }
}

class Order {
    private Payment payment = new Payment();
    private Invoice invoice = new Invoice();

    void placeOrder() {
        payment.processPayment();
        invoice.generateInvoice();
        System.out.println("Order Placed Successfully!");
    }
}
