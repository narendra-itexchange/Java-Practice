public class Main {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(4114,500);
        myAccount.depositMoney(100);
        myAccount.withdrawMoney(200);
        myAccount.displayBalance();
    }
}
