package JavaPractices;

import java.util.Scanner;

public class AracCagirma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        //WRITE YOUR CODE HERE:
        if(vehicleYear < 1995) {
            System.out.println("Your vehicle is fine, enjoy!");
        } else if(vehicleYear <= 1998){
            System.out.println("Your vehicle needs to be recalled!");
        }else if(vehicleYear == 1999 || vehicleYear== 2000){
            System.out.println("Your vehicle is fine, enjoy!");
        }else if(vehicleYear == 2001 || vehicleYear == 2002){
            System.out.println("Your vehicle needs to be recalled!");
        }else if(vehicleYear==2003){
            System.out.println("Your vehicle is fine, enjoy!");
        }else if(vehicleYear<=2006){
            System.out.println("Your vehicle needs to be recalled!");
        }else if(vehicleYear <= 2014){
            System.out.println("Your vehicle is fine, enjoy!");
        }else if(vehicleYear <= 2017){
            System.out.println("Your vehicle needs to be recalled!");
        }else{
            System.out.println("Your vehicle is fine, enjoy!");
        }

    }
}
