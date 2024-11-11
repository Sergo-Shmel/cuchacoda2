public class CreditCard implements PaymentSystem{
    private String cardNumber;
    private String cardHolderName;

    public CreditCard(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " рублей с карты " +
                cardNumber + " (" + cardHolderName + ")");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Возврат " + amount + " рублей на карту " +
                cardNumber + " (" + cardHolderName + ")");
    }
}
