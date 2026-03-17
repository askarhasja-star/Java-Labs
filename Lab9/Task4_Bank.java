import java.util.Scanner;

class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Недостаточно средств");
    }
}

class SavingsAccount extends BankAccount {}
class CreditAccount extends BankAccount {}

public class Task4_Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingsAccount acc = new SavingsAccount();

        System.out.print("Пополнение: ");
        double d = sc.nextDouble();
        acc.deposit(d);

        System.out.print("Снятие: ");
        double w = sc.nextDouble();
        acc.withdraw(w);

        System.out.println("Баланс: " + acc.balance);
    }
}