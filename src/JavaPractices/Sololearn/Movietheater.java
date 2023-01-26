package JavaPractices.Sololearn;
import java.util.Scanner;
public class Movietheater {

    public static void main(String[] args) {
        int count=0;
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

        for(int x=0; x<seats.length; x++){
            for(int y=0; y<seats[x].length; y++){
            if(seats[x][y] == 0) {
                count++;
            }
            }
        }
        System.out.println("There are still "+count + " seat(s) available!");
    }

}
