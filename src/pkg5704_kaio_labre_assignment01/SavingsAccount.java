/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5704_kaio_labre_assignment01;

import java.util.Scanner;

/**
 *
 * @author 5704
 */
public class SavingsAccount extends Account implements Interest{
    //pre set withdraw limit
    private float withdrawLimit = 1000;
    public int hundredNotes = 0;
    public int fiftyNotes = 0;
    public int twentyNotes = 0;

    public int getHundredNotes() {
        return hundredNotes;
    }

    public void setHundredNotes(int hundredNotes) {
        this.hundredNotes = hundredNotes;
    }

    public int getFiftyNotes() {
        return fiftyNotes;
    }

    public void setFiftyNotes(int fiftyNotes) {
        this.fiftyNotes = fiftyNotes;
    }

    public int getTwentyNotes() {
        return twentyNotes;
    }

    public void setTwentyNotes(int twentyNotes) {
        this.twentyNotes = twentyNotes;
    }


    public float getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(float withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    // Withdraw limit in this account can be changed by the user:
    public void newWithdrawLimit (){
        Scanner limit = new Scanner(System.in);
        System.out.println("Please enter new withdraw limit: ");
        setWithdrawLimit(limit.nextFloat());
        System.out.println("Success! Your new withdraw limit has been set to: "+getWithdrawLimit());
    }
    

    //give savings account its own attributes
    public SavingsAccount(String accountName, String accountType, int accountNumber, int accountBSB, float accountBalance) {
        super(accountName, accountType, accountNumber,accountBSB, accountBalance);
    }
///////////////////////////////////////// DEPOSIT
    @Override
    public int Deposit(float deposit) {       
       //update balance
       this.accountBalance = this.accountBalance + deposit;
       
       return 1;       
    }
  /////////////////////////////////////////////// WITHDRAW
    @Override
    public int Withdraw(int withdraw) { 
       // withdraw cannot take more money that exist in the account
        if (withdraw <= accountBalance){
            // user cannot withdraw more money than the set limit (it is not complete functioning at this stage as date and time is
            //is not included in the project, so the user can still make as many withdraws as they want
            // return 1 ==  withdrawlimit
            // return 2 == out of balance
            // return 3 == successful
            // return 4 == Enter a valid Value
            // return 5 == Unable to withdraw, Only 20, 50 ....
            if (withdraw > getWithdrawLimit())
            {
                return 1;
            }
            else if(withdraw <= getWithdrawLimit())
            {
                //This ATM only have 20, 50 and 100 notes so the amount has to be "withdrawable"
                
                int dividend = 0, divisor = 0, remainder = 0;
                
                //calculate how many 100 notes
                dividend = withdraw;
                divisor = 100;
                
                hundredNotes = dividend/ divisor;
                remainder = dividend % divisor; // it will be used to calculate 50 and 20 notes
                
                
                //calculate how many 50 notes
                dividend = remainder;
                divisor = 50;

                fiftyNotes = dividend / divisor;
                remainder= dividend % divisor; // it will be used to calculate 20 notes
                    
                //calculate how many 20 notes
                dividend =  remainder;
                divisor = 20;

                twentyNotes = dividend / divisor;
                remainder = dividend % divisor; // in this line remainder must be 0  otherwise amount is not withdrawable
                
                if (remainder == 0)
                {   accountBalance = accountBalance - withdraw;
                    
                    return 3;
                }
                else if (remainder != 0){
                    return 5;
                }
                else
                    return 4;
                
            } 

        }
        else if (withdraw > accountBalance)
        {
            return 2;
        }
        // just in case of a dumb user
        else{
            return 4;
        }
        return 0;
    }

    /////////////////////////////////////////////////////////////////INTEREST
    // I assumed that interest increases due to the banks investiments (profit)
    @Override
    public float calculateInterest() {
        float interest = (accountBalance / 100) ; //1% interest
        // update accountBalance
        accountBalance = accountBalance + interest;
        System.out.println("The interest of this account is 1%: AUD "+interest);
        System.out.println("Your account balance after the daily interest is: "+accountBalance);
        return interest;
    }    
}
 