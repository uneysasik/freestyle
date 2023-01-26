package JavaPractices.Sololearn;
import java.util.Scanner;
public class Movietheater {

    public static void main(String[] args) {
        int[][] seats = {
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select a row number of a seat!");
        int row = sc.nextInt();
        System.out.println("Please select a column number of a seat!");
        int column = sc.nextInt();

        if(seats[row][column] == 0) {
            System.out.println("Free");
        } else {
            System.out.println("Sold");
        }
    }

}
