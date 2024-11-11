public class PayPal implements PaymentSystem {
    private String payPalID;

    PayPal(String payPalID) {
        this.payPalID = payPalID;
    }

    public String getPayPalID() {
        return payPalID;
    }

    public void setPayPalID(String payPalID) {
        this.payPalID = payPalID;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " рублей через PayPal (payPalID: " + payPalID + ")");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Возврат " + amount + " рублей через PayPal (payPalID: " + payPalID + ")");
    }
}
