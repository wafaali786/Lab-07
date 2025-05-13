class BankAccount {

    public double getInterestRate(){
        return 0.05;
    }
}

class SavingsAccount extends BankAccount {
    
    public double getInterestRate (){
        return 0.10 ;
    }
}

public class AccountsCheck {
    public static void main(String[] args) {
    
    BankAccount ganeralAccount = new BankAccount();
    BankAccount savingAccount = new BankAccount();

    System.out.println("Bank Account interest rate is : "+ganeralAccount.getInterestRate());
    System.out.println("Savinging Account interest rate is : "+savingAccount.getInterestRate());    
    }


}