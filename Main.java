package OOPlab;


import OOPlab.BankAccount;





public class Main {

   
    public static void main(String[] args) {
        
        
        BankAccount.bonus(10); // changing this will change add/remove bonus amount from all accounts 
        BankAccount []accounts = new BankAccount[5]; // creating array of 5 elements of type BankAccount class
        accounts[0] = new BankAccount("Mansoor",58,"152-E",10000);
        accounts[1] = new BankAccount("Faizan",037,"152-E",5000);
        accounts[2] = new BankAccount("Junaid",041,"152-E",1000);
        accounts[3] = new BankAccount("Ammad",061,"152-E",500);
        accounts[4] = new BankAccount("Khizar",115,"152-E",100);
        
        
        
        
        
        for (int i = 0 ; i < accounts.length ; i++ ) //loop for displaying balanceInfo for all accounts in array
        {
            accounts[i].balanceInfo();
            System.out.print("\n\n");
        }
       
        
      
        
      }
    
}
