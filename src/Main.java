import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATMOperationInterface atmOperationInterface = new ATMOperation();
        int atmNumber = 12345;
        int atmPin = 123;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine!!");
        System.out.println("Enter ATM Number: ");
        int atmInputNumber = scanner.nextInt();
        System.out.println("Enter ATM Pin: ");
        int atmInputPin = scanner.nextInt();

        if ((atmNumber == atmInputNumber) && (atmPin == atmInputPin)){
            while(true){
                System.out.println("1.View Available Balance");
                System.out.println("2.Withdraw Amount");
                System.out.println("3.Deposit Amount");
                System.out.println("4.View Ministatement");
                System.out.println("5.Exit");
                System.out.println("Enter Choice: ");
                int userChoice = scanner.nextInt();
                if (userChoice == 1){
                    atmOperationInterface.viewBalance();
                } else if (userChoice == 2) {
                    System.out.println("Enter Amount to Withdraw: ");
                    double withdrawAmout = scanner.nextDouble();
                    atmOperationInterface.withdrawAmount(withdrawAmout);
                } else if (userChoice == 3) {
                    System.out.println("Enter Amount To Deposite : ");
                    double depositedAmount = scanner.nextDouble();
                    atmOperationInterface.depositAmount(depositedAmount);
                } else if (userChoice == 4) {
                    atmOperationInterface.viewMiniStatement();
                }else if (userChoice == 5){
                    System.out.println("Collect Your ATM Card!");
                    System.out.println("Thank You For Using ATM Machine!!");
                    System.exit(0);
                }else {
                    System.out.println("Please Enter Correct Choice!");
                }
            }
        }else {
            System.out.println("Incorrect ATM Number or Pin");
            System.exit(0);
        }

    }
}