public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; 


    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        accounts++;
    }

    public static int getAccounts() {
        return accounts;
    }
    public static double getTotalMoney() {
        return totalMoney;
    }
public  double checkingBalance(){

    return this.checkingBalance;
}
public double savingsBalance(){
    return this . savingsBalance;
}
public int accounts(){

    return this.accounts;

}
public double totalMoney(){
return this . totalMoney;

}

//users should be able to deposit money into their checking or savings account
public void deposit(String account, double amount) {
    if (account.equals("checking")) {
        this.checkingBalance += amount;
        totalMoney += amount;
    } else if (account.equals("savings")) {
        this.savingsBalance += amount;
        totalMoney += amount;
    } else {
        System.out.println("Invalid account type.");
    }
}
public void withdraw(String account, double amount) {
    if (account.equals("checking")) {
        if (this.checkingBalance - amount < 0) {
            System.out.println("Insufficient funds.");
        } else {
            this.checkingBalance -= amount;
            totalMoney -= amount;
        }
    } else if (account.equals("savings")) {
        if (this.savingsBalance - amount < 0) {
            System.out.println("Insufficient funds.");
        } else {
            this.savingsBalance -= amount;
            totalMoney -= amount;
        }
    } else {
        System.out.println("Invalid account type.");
    }

}
public void getBalance() {
    System.out.println("Checking balance: " + this.checkingBalance);
    System.out.println("Savings balance: " + this.savingsBalance);
}
}