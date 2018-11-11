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

//Cheque account offers no interest and it also has no daily withdrawal limit.

public class ChequeAccount extends Account {
    //give Cheque account its own attributes
    public ChequeAccount(String accountName, String accountType, int accountNumber, int accountBSB, float accountBalance) {
        super(accountName, accountType, accountNumber,accountBSB, accountBalance);
    }
    int hundredNotes = 0;
            int fiftyNotes = 0;
            int twentyNotes = 0;
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

    
}
