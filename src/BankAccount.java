public class BankAccount {
   private int accountNumber;
   private int accountBalance;

   public BankAccount(int accountNumber,int accountBalance){
       this.accountBalance=accountBalance;
       this.accountNumber=accountNumber;
   }


   public void depositMoney(int addMoney){

       if(addMoney<0){
           System.out.println("You can't add negative money");
       }
       else{

       this.accountBalance =this.accountBalance+addMoney;
       System.out.println(addMoney+" is deposited to your account "+this.accountNumber);
       


   }
   }

   void withdrawMoney(int removeMoney){
       if(removeMoney>this.accountBalance){
           System.out.println("You don't have sufficient amount to withdraw");
       }
       else{
           this.accountBalance = this.accountBalance-removeMoney;
           System.out.println(removeMoney + " Has been deducted from your account "+this.accountNumber);
       }
   }

   public void displayBalance(){
       System.out.println("Your account balance is "+this.accountBalance);
   }

}
