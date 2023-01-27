package JavaPractices.Sololearn;
import java.util.Scanner;
public class Celcius2Fahrenheit {

    //your code goes here
    static double fahr(double x){
        double fahr = (1.8 * x) + 32;

        return fahr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();

        System.out.println(fahr(c));
    }
}
