package JavaPractices.Sololearn;

import java.util.Scanner;

public class Methods {
    //your code goes here
    /*
    User message: "1", Reply: "Order confirmed"
    User message: "2", Reply: "info@sololearn.com"
    For any other number, the reply should be: "Try again".
    */
    public static void main(String[] args) {
        bot();
    }

    public static void bot() {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input == 1) {
            System.out.println("Order confirmed");
        } else if (input == 2) {
            System.out.println("info@sololearn.com");
        } else{
            System.out.println("Try Again");
        }
    }
}
