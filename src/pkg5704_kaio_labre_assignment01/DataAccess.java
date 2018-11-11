/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5704_kaio_labre_assignment01;

/**
 *
 * @author 5704
 */
public class DataAccess {
    
        SavingsAccount savings = new SavingsAccount("Savings Account", "Savings", 1111,111, 0);
        NetSavingsAccount net = new NetSavingsAccount("Net-Saver Account", "Net-Saver", 2222,222, 0);
        ChequeAccount cheque = new ChequeAccount("Cheque Account","Cheque", 3333, 333, 0);
        FixedAccount fixed = new FixedAccount("Fixed Account","Fixed", 4444, 444, 0);
        
        float viewSavingsAccountBalance () {
            float balance = savings.getAccountBalance();
            return balance;
        }
        float viewNetAccountBalance () {
            float balance = net.getAccountBalance();
            return balance;
        }
        float viewChequeAccountBalance () {
            float balance = cheque.getAccountBalance();
            return balance;
        }
        float viewFixedAccountBalance () {
            float balance = fixed.getAccountBalance();
            return balance;
        }
        
        int withdrawSavingsAccount (int withdraw) {
            return savings.Withdraw(withdraw);
        }
        int depositSavingsAccount (float deposit) {
            return savings.Deposit(deposit);
        }
}
