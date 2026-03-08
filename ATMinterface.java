import java.util.Scanner;


class BankAccount {
    private double balance;

    
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }

    
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }

    
    public double getBalance() {
        return balance;
    }
}



class ATM {
    private BankAccount account;

    
    public ATM(BankAccount account) {
        this.account = account;
    }

    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            account.withdraw(amount);
        }
    }

    
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            account.deposit(amount);
        }
    }

    
    public void checkBalance() {
        System.out.println("Current balance: " + account.getBalance());
    }

    
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n-----ATM MENU-----");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 4);
    }
}



public class ATMinterface {
    public static void main(String[] args) {

        
        BankAccount userAccount = new BankAccount(5000);

        
        ATM atm = new ATM(userAccount);

        
        atm.showMenu();
    }
}
