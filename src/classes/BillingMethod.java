package classes;

public class BillingMethod {

    String paymentOptions;
    boolean paymentConfirmed;

    public BillingMethod(String paymentOptions) {
        this.paymentOptions = paymentOptions;
        this.paymentConfirmed = false;

    }

    public void confirmPayment() {
        this.paymentConfirmed = true;

    }

    public void displayPaymentMethod() {
        System.out.println("###BILLING_INFO###");
        System.out.println("Payment Options: " + paymentOptions);
        System.out.println("Payment Confirmation: " + (paymentConfirmed ? "Confirmed" : "Not Confirmed"));
        System.out.println("###################\n");
    }


}
