//6. Инкапсуляция: Банк
//Создайте класс BankAccount с полями accountNumber, balance, и методами для пополнения и снятия средств.
// Обеспечьте инкапсуляцию для безопасности данных счета.
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("129312", 1000);
        account.Info();

        account.deposit(100);
        account.Info();

        account.withdraw(300);
        account.Info();

        account.withdraw(1000);
        account.Info();

        account.withdraw(1000);
        account.Info();
    }
}