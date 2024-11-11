public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
            System.out.println("Пополнение на сумму: " + amount + " успешно выполнено!");
        }else{
            System.out.println("Ошибка! Сумма пополнения должна быть положительна!");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && balance >= amount){
            balance -= amount;
            System.out.println("Снятие на сумму: " + amount + " успешно выполнено!");
        } else if (amount <= 0) {
            System.out.println("Ошибка! Сумма снятия должна быть положительна!");
        } else{
            System.out.println("Ошибка! Недостаточно средств на счёте!");
        }
    }

    public void Info(){
        System.out.println("Номер счёта: " + accountNumber);
        System.out.println("Баланс: " + balance);
    }
}
