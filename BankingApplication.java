// Munazza Fahmeen 

//A banking application using Java performing deposits, withdraws and showing total amount
//Program asks user to enter Option A, B, C, D or E to navigate the program
// After the option is chosen it goes through the for loops and cases in order to perform operations


import java.util.Scanner;
public class BankingApplication {
    public static void main(String[] args) {

      
        //creates a constructor in the main function to show user name and account number

        BankAccount obj1 = new BankAccount("User1", "46638294");

        System.out.println("Welcome to M Transactions. Please enter a option below to proceed.");

        //shows options avaliable for User 
        obj1.showOptions();
    }
}

class BankAccount 
{
   //initalizing and creating variables 
   //int used for inputs where it is only numbers 
   //Balance is the total money in account
    int balance;

   //Previous transaction is the last transaction occurred
    int previousTransaction;
   
    //String used for words / objects
    String customerName;
    String customerId;

    
    BankAccount(String cname, String cid)
    {
        customerName = cname; 
        customerId = cid;

    }

   //Amount is the parameter
    void deposit(int amount)
    {
       //Loop
        if(amount !=0)
        {
            //will perform operation of calculating balance after deposit
            balance = balance + amount;
            previousTransaction = amount;

        }
    }

    void withdraw(int amount)
    {
        if (amount != 0)
        {
            //Performs calculation after withdrawal
            balance = balance - amount;
            previousTransaction = - amount;
            
        }
    }

    void getPreviousTransaction()
    {
        //Performs for displaying the previous transaction again

        if(previousTransaction > 0)
        {
            System.out.println("Deposited: " + previousTransaction);
        }
        else if (previousTransaction < 0)
        {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));

        }

        //This is a case when no transaction was occurred previously this message will come up
        else 
        {
            System.out.println("No transaction occurred");
        }
    }

    //The welcome statments and determining different options the user might choose 
    void showOptions()
    {
        //Displaying options avaliable for the user
        char option = '\0';

        //used to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome " +customerName);
        System.out.println("Your ID is " +customerId);
        System.out.println("Option A: Check Balance");
        System.out.println("Option B: Deposit " );
        System.out.println("Option C: Withdraw ");
        System.out.println("Option D: Previous Transaction " );
        System.out.println("Option E: Exit ");

        do
        {
            //Asking the user to choose a option from the above menu
            System.out.println("\n");
            System.out.println("------------------------------------------");
            System.out.println("Enter an option below:");
            System.out.println("------------------------------------------");
            System.out.println("\n");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            //Determining the different options the user can choose to perform operations accordingly
            switch (option)
            {
                //If Option 'A' is chosen then it will trigger the check balance option which would calculate 
                //or check the total balance the user has
                case 'A':
                System.out.println("\n");
                System.out.println("------------------------------------------");
                System.out.println("Balance = " + balance);
                System.out.println("------------------------------------------");
                System.out.println("\n");
                break;

                //If Option 'B' is chosen then it will trigger the deposit balance option 
                case 'B':
                System.out.println("\n");
                System.out.println("------------------------------------------");
                System.out.println("Enter amount to deposit " );
                System.out.println("------------------------------------------");
                System.out.println("\n");
               
                //Allows the user to enter a deposit amount
                int amount = scanner.nextInt();

                //stores user input in the int 'amount'
                deposit(amount);
                System.out.println("\n");
                break;

                //If Option 'C' is chosen then it will trigger the withdraw option
                case 'C':
                System.out.println("\n");
                System.out.println("------------------------------------------");
                System.out.println("Enter amount to withdraw " );
                System.out.println("------------------------------------------");
                System.out.println("\n");

                //Allows user to input the amount to withdraw
                int amount2 = scanner.nextInt();

                //Stores user input in the int amount2
                withdraw(amount2);
                System.out.println("\n");
                break;

                //If Option 'D' is chosen then it will trigger the Previous Trasaction option 
                case 'D':
                System.out.println("\n");

                //Shows the previous transaction occurred
                getPreviousTransaction();
                System.out.println("------------------------------------------");
                System.out.println("\n");
                System.out.println("\n");
                break;

                //If Option 'E' is chosen then it will trigger the exit option and end the program
                case 'E':
                System.out.println("^^^^^^^^^^^^^^^^");
                break;


                // If the user enters anything else other than the options listed then this default function will be triggered
                //Displays error/invalid message and lets user input an option again 
                default:
                System.out.println("****Invalid! Please try again******");
                break;
            
        
    
            }

        }

        //When the option 'E' is chosen by the user the end message will be printed.

        while (option != 'E');
        System.out.println("Thank you for using M Transactions!");;
    }
}