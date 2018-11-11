
package pkg5704_kaio_labre_assignment01;

public abstract class Account {
   
    // Initiate all class atributes
    protected String accountName, accountType;
    protected int accountNumber, accountBSB; 
    protected float accountBalance;

    public Account(String accountName, String accountType, int accountNumber, int accountBSB, float accountBalance) {
        this.accountName = accountName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountBSB = accountBSB;
        this.accountBalance = accountBalance;
    }
    // constructor to set all attributes
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountBSB(int accountBSB) {
        this.accountBSB = accountBSB;
    }
    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }   
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
    //constructor to get the value of all attributes
    public String getAccountName() {
        return accountName;
    }

    public String getAccountType() {
        return accountType;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getAccountBSB() {
        return accountBSB;
    }
    public float getAccountBalance() {
        return accountBalance;
    }
    
    //Set global functions
    // I assumed that the withdraw has to be an integer type, otherwise it wont be withdrawable anyway 
    public abstract int Withdraw(int withdraw);
    public abstract int Deposit(float deposit);   
    
}
