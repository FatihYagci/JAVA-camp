import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("IT works!!!!!");

            Scanner scannedNum = new Scanner(System.in);
            int number;
            int number;
            int sum = 0;
            System.out.println("Give a number");
            number = scannedNum.nextInt();

            for(int i = 1; i < number ; i++){
            if(number%i ==0){
                sum += i;
            }
        }

        if( sum == number){
            System.out.print("it is a perfect number");
        }
        else{
            System.out.print("it is not a perfect number");

        }







    }
}