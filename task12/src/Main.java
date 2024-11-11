import javax.smartcardio.Card;

//Интерфейс "Платежная система"
//Создайте интерфейс PaymentSystem с методами pay() и refund().
//Реализуйте классы CreditCard и PayPal, которые реализуют этот интерфейс.
public class Main {
    public static void main(String[] args) {
        PaymentSystem card = new CreditCard("93274","Ivan");
        card.pay(100);
        card.refund(200);

        PaymentSystem paypal = new PayPal("91238");
        paypal.pay(100);
        paypal.refund(200);

   }
}