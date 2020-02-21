package OOPlab;

public class BankAccount {
     String bankTitle;
     int bankNo;
     String Address;
     float balance;
     float totalBalance;
     static int bonus = 0;
     
   public BankAccount(String bT,int bN , String add , float b )
   {
       bankTitle = bT;
       bankNo = bN;
       Address = add;
       balance = b;
       totalBalance = (balance/100*bonus)+balance;
   }
  
   public void credit(int x)
   {
       balance  = balance + x;
   }
   public void debit(int x)
   {
       balance = balance - x;
   }
   public void balanceInfo()
   {
       System.out.println("NAME : " + bankTitle);
       System.out.println("Bank NO# " + bankNo);
       System.out.println("Balance : " + balance);
       System.out.println("Address : " + Address);
       System.out.println("Total Balance : " + totalBalance);
       
   }
  
   static public int bonus(int x)
   {
       bonus  = x ; 
       return bonus;
       
   }
   
}
