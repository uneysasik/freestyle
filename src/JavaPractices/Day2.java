package JavaPractices;

import java.util.Scanner;

public class Day2 {

    public static void main(String args[]) {

//        char i;
//        LOOP: for (i=0; i<5;i++) {
//            switch(i++) {
//                case '0':
//                    System.out.println("A");
//                case 1:
//                    System.out.println("B"); break LOOP; // Buraya kadar sisteme girmiyor.
//                case 2:
//                    System.out.println("C"); break;
//                case 3:
//                    System.out.println("D"); break;
//                case 4:
//                    System.out.println("E");
//                case 'E':
//                    System.out.println("F");
//
//            }
//        }


//        Scanner scan = new Scanner(System.in);
//        String str = scan.next();
//
//        int firstIndex = str.indexOf("bread");
//        int lastIndex = str.lastIndexOf("bread");
//
//        if(firstIndex == lastIndex){
//            System.out.println("nothing");
//        }else {
//            System.out.println(str.substring(firstIndex+5,lastIndex));
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int n = scan.nextInt();

//        for(int i=1;i<n;i++) {
//            System.out.println("*");
//            for(int j=1;j<=i;j++) {
//                System.out.print("*");
//            }
//        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
