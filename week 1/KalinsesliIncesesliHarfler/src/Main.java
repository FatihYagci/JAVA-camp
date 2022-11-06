import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char harf = 'i';

        switch (harf){
             case 'A': case'a':
             case 'I': case'ı':
             case 'O': case'o':
             case 'U': case'u':
                System.out.println("Girilen harf kalın ünlü harftir");
                break;
             case 'E': case'e':
             case 'İ': case 'i':
             case 'Ö': case 'ö':
             case 'Ü': case'ü':
                System.out.println("Girilen harf ince ünlü harftir");
                break;
             default:
                System.out.println("Girilen harf sessiz harftir");
        }
    }
}




/*
*
*
* System.out.println("It works !!!!");

        String letter = "k" ;

        //int k;

        Scanner scanned = new Scanner(System.in);

        letter = scanned.next();
        int X = Integer.parseInt(letter);


        System.out.println(X);
*
*
* */