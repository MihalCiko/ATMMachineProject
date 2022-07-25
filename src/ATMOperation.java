import java.util.HashMap;
import java.util.Map;

public class ATMOperation implements ATMOperationInterface{
    ATM atm = new ATM();
    Map<Double,String> ministatmentMap = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 500 == 0) {
            if (withdrawAmount <= atm.getBalance()) {
                ministatmentMap.put(withdrawAmount, " Amount Withdrawn");
                System.out.println("Collect the Carsh: " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance!!");
            }
        }else {
            System.out.println("Please enter the amount in multiple of 500!!");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministatmentMap.put(depositAmount, " Amount Deposited");
        System.out.println(depositAmount + " Deposited Successfully!!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double,String> map : ministatmentMap.entrySet()){
            System.out.println(map.getKey() + "" + map.getValue());
        }
    }
}
