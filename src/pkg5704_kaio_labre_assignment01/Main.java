package pkg5704_kaio_labre_assignment01;

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        
        
        
        WelcomeScreen ws = new WelcomeScreen();   
        ws.setVisible(true);
        
        /*
        // this variable will be used as a condition to determine if the program will end or not
        boolean keepGoing = true;
        
        while (keepGoing != false){
            ws.setVisible(true);
            
            System.out.println("Please select the desired procedure:");
            System.out.println("1.............View Balance");
            System.out.println("2.............Deposit");
            System.out.println("3.............Withdraw");
            System.out.println("4.............Settings");
            System.out.println("5.............End");

            //create class to scann the keyboard option
            Scanner procedure = new Scanner(System.in);
            //user interaction
            System.out.print("Enter desired option: ");
            //read user interaction
            int procedureOption = procedure.nextInt();

            // I could have used the swicth statement in this part of the code, but it is new for me
            // so I didnt want to take the risk
            if (procedureOption == 1 ){
                System.out.println("Account................Balance");
                System.out.println("Savings................"+savings.getAccountBalance());
                System.out.println("Net-Saver.............."+net.getAccountBalance());
                System.out.println("Cheque................."+cheque.getAccountBalance());
                System.out.println("Fixed.................."+fixed.getAccountBalance());
            }
            else if (procedureOption == 2) {
                System.out.println("Please select desired account for the Deposit: ");
                System.out.println("1................Savings Account");
                System.out.println("2................Net-saver Account");
                System.out.println("3................Cheque Account");
                System.out.println("4................Fixed Account");
                System.out.println("5................Exit");

                //create class to scann the keyboard option
                Scanner input = new Scanner(System.in);
                //user interaction
                System.out.print("Enter desired option: ");
                //read user interaction
                int accountOption  = input.nextInt();

                if (accountOption == 1){
                    savings.Deposit();
                }
                else if (accountOption == 2){
                    net.Deposit();
                }
                else if (accountOption == 3){
                    cheque.Deposit();
                }
                else if (accountOption == 4){
                    fixed.Deposit();
                }
                else  if (accountOption == 5){
                    continue;
                }
                else
                    System.out.println("Please enter a valid value.");
            }
            else if (procedureOption == 3){
                System.out.println("Please select desired account for the Withdrawt: ");
                System.out.println("1................Savings Account");
                System.out.println("2................Net-Saver Account");
                System.out.println("3................Cheque Account");
                System.out.println("4................Fixed Account");
                System.out.println("5................Exit");

                //create class to scann the keyboard option
                Scanner input = new Scanner(System.in);
                //user interaction
                System.out.print("Enter desired option: ");
                //read user interaction
                int accountOption  = input.nextInt();

                if (accountOption == 1){
                    savings.Withdraw();                        
                }
                else if (accountOption == 2){
                    net.Withdraw();
                }
                else if (accountOption == 3){
                    cheque.Withdraw();
                }
                else if (accountOption == 4){
                    fixed.Withdraw();
                }
                else if (accountOption == 5){
                    continue;
                }
                else
                    System.out.println("Please enter a valid value.");
            }
            else if(procedureOption == 4){
                System.out.println("Please select desired settings option: ");
                System.out.println("1 - Change Savings Account Withdraw Limit");
                System.out.println("2 - Calculate Savings Account Interest");
                System.out.println("3 - Caculate Net-saver Account Interest");
                System.out.println("4 - Calculate Fixed Account interest");
                System.out.println("5 - Back");

                //create class to scann the keyboard option
                Scanner input = new Scanner(System.in);
                //user interaction
                System.out.print("Enter desired option: ");
                //read user interaction
                int settingsOption  = input.nextInt();

                if (settingsOption == 1 ){
                    savings.newWithdrawLimit();
                }
                else if (settingsOption == 2){
                    savings.calculateInterest();
                }
                else if (settingsOption == 3){
                    net.calculateInterest();
                }
                else if (settingsOption == 4){
                    fixed.calculateInterest();
                }
                else if (settingsOption == 5){
                    continue;
                }

            }
            else if (procedureOption == 5){
                break;
            }
            else 
                System.out.println("Please enter a valid Option.");

        }*/
    }            
}
