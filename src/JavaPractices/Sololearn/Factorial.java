package JavaPractices.Sololearn;
import java.util.Scanner;
public class Factorial {


           public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
               System.out.println("Please enter a number");
            int fn = sc.nextInt();
            int sum = 1;


               for(int x = 1; x <= fn; x++){
                sum = sum * x;
            }
            System.out.println(sum);
        }
    }

