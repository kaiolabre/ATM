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

/*
Fixed offers the biggest interest rate, however it is only calculated after a fixed contract period. 
If user witdraws before this contract period, they receive no interest (assume any withdrawal is too early, 
so keep track of early withdrawal in a boolean attribute for the class). Fixed account has no daily withdraw limit.

NOTE: Don’t worry about time and dates. Assume someone is writing that side of the project. 
So for calculating interest just provide a function to add interest to the account and assume it will be called at the right times. 
The special case for this in the Fixed Account, which may yield no interest if withdrawn from early.

*/
public class FixedAccount extends Account implements Interest{
    
    boolean earlyWithdraw = false; // attribute in case withdraw is taken before the contract
    public int hundredNotes = 0;
    public int fiftyNotes = 0;
    public int twentyNotes = 0;
    
//give Fixed account its own attributes
    public FixedAccount(String accountName, String accountType, int accountNumber, int accountBSB, float accountBalance) {
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
        
        else if (withdraw > accountBalance)
        {
            return 2;
        }
        // just in case of a dumb user
        else{
            return 4;
        }
    }

    /////////////////////////////////////////////////////////////////INTEREST
    // I assumed that interest increases due to the banks investiments (profit)
    @Override
    public float calculateInterest() {
        float interest = 0;
        if (earlyWithdraw == false){    
        interest = (accountBalance / 100) * 10; //10% interest
        // update accountBalance
        accountBalance = accountBalance + interest;
        System.out.println("The interest of this account is 10%: AUD "+interest);
        System.out.println("Your account balance after the daily interest is: "+accountBalance);
       }
        else if (earlyWithdraw == true){
           System.out.println("You have made an early withdraw for this account, so interest is not applicable.");
       }
       return interest;
    } 
}
