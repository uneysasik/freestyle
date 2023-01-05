package JavaPractices;

import java.util.Scanner;

public class StringUygulama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Sandviç giriniz");
        String sandvic = scan.nextLine();
        String a = "bread";

//        int ilk = a.length();
//        int son = sandvic.lastIndexOf(a);
//        //System.out.println(sandvic.substring(ilk,son));
//        System.out.println(sandvic.lastIndexOf("bread"));

        int firstIndex = 0;
        int lastIndex = 0;


        firstIndex = sandvic.indexOf("bread");
        firstIndex = firstIndex + "bread".length();

        lastIndex = sandvic.lastIndexOf("bread");

//there should be at least two breads
        if (firstIndex != -1 && lastIndex != -1 && sandvic.length() > 10) {
            System.out.println(sandvic.substring(firstIndex, lastIndex));
        } else {
            System.out.println("nothing");

//        if (sandvic.contains(a)) {
//            System.out.println(sandvic.substring(sandvic.indexOf(a.length()),sandvic.lastIndexOf(a)));
//        } else {
//            System.out.println("Nothing");
//        }


        }
        //   Example:
//
//
//        input: breadjambread
//
//        output: jam
//
//
//
//        input: xxbreadjambreadyy
//
//        output: jam
//
//
//
//        input: xxbreadapple
//
//        output: nothing
//
//
//
//        input: breadbutterbread
//
//        output: butter
//
    }
}
