public class BankAccount {

   public BankAccount() {
   
      balance = 0;
   
   }
   
   public BankAccount(double initialBalance) {
   
      balance = initialBalance;
   
   }
   
   public void deposit(double amount) {
   
      //double newBalance = balance + amount - fee;
      double newBalance = balance + amount;
      balance = newBalance;
      transactions = transactions + 1;
   
   }
   
   public void withdraw(double amount) {
   
      //double newBalance = balance - amount - fee;
      double newBalance = balance - amount;
      balance = newBalance;
      transactions = transactions + 1;
   
   }
   
   public double getBalance() {
   
      return balance;
   
   }
   
   public void deductMonthlyCharge() {
   
      double monthlyFee = (transactions - freeTransactions) * fee;
      double newBalance = balance - monthlyFee;
      balance = newBalance;
      transactions = 0;
   
   }
   
   private double balance;
   private double fee = 1;
   private int transactions = 0;
   private int freeTransactions = 3;
   
}
