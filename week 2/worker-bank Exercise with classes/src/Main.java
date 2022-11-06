import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("It WORKS !!!!!");

//      (String name,int password , double balance, double income, int socialSecurityNumber, int workingHours)
        Account Berkay = new Account("Berkay",1234 ,5000.00, 900.00, 10001, 45);
        Account Fatih = new Account("Fatih", 9988, 2000.25, 850, 10002, 45);


        System.out.println("Please enter your password: ");
        Scanner scannedInput = new Scanner(System.in);
        int scannedPassword = scannedInput.nextInt();

        if (scannedPassword == Berkay.getPassword()) {
            System.out.println("name: "+ Berkay.getName());
            System.out.println("balance: "+ Berkay.getBalance());
            System.out.println("password: "+ Berkay.getPassword());
            System.out.println("income: "+ Berkay.getIncome());
            System.out.println("Social security number: "+ Berkay.getSocialSecurityNumber());
            System.out.println("Working hours: "+ Berkay.getWorkingHours());
        }else if (scannedPassword == Fatih.getPassword()){
            System.out.println("name: "+ Fatih.getName());
            System.out.println("balance: "+ Fatih.getBalance());
            System.out.println("password: "+ Fatih.getPassword());
            System.out.println("income: "+ Fatih.getIncome());
            System.out.println("Social security number: "+ Fatih.getSocialSecurityNumber());
            System.out.println("Working hours: "+ Fatih.getWorkingHours());
        }else {
            System.out.println("Wrong input no info will be shown.");
        }
    }
}