
import java.util.Scanner;

public class ATM
{
    public static void main(String args[] )
    {
        int balance = 100000, withdraw, deposit;
        int pin = 1234;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name= sc.nextLine();
        System.out.println("Welcome!..."+name);
        System.out.println("Enter your Pin");
        int password = sc.nextInt();
        if(password == pin){




        while(true)
        {
            System.out.println("Username:"+name);
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");


            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");

                    withdraw = sc.nextInt();

                    if(balance >= withdraw)
                    {

                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                        System.out.println("Thank You Visit again");
                    }
                    else
                    {

                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");


                    deposit = sc.nextInt();


                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:

                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Thankyou Visit Again");
                    System.exit(0);
            }
        }
    }
        else{
            System.out.println("Your pin is incorrect...Enter Correct pin!");
        }
} }
