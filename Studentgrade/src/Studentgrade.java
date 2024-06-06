import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Studentgrade {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner (System.in);
        ArrayList<Integer> grade = new ArrayList<>(5);
        ArrayList<String> name = new ArrayList<>(5);
        name.add("vishwash");
        name.add("nandha");
        grade.add(8);
        grade.add(9);


        while(true) {
            System.out.println("please select To add (1) or show (2) or average(3) or highest(4) or lowest(5) or check size");
            System.out.println("press x to cancel ");
            String i= input.next();
            if (Objects.equals(i, "x")){
                return;
            }
            switch(i) {

                case "1":
                    String ss = input.next();
                    int ii = input.nextInt();
                    add(name , grade, ss,ii);
                    break;
                case "2":
                    show(name, grade);
                    break;
                case "3":
                    average(grade);
                    break;
                case "4":
                    highest(grade);
                    break;
                case "5":
                    lowest(grade);
                    break;
                case "6":
                    int h = grade.size();
                    System.out.println(h);
            }
        }
    }

     static void lowest(ArrayList<Integer> grade) {
        // TODO Auto-generated method stub
        int low =0 ;

         for (Integer integer : grade) {
             low = grade.getFirst();
             int one = integer;
             if (low > one)
                 low = one;
         }
        System.out.println("lowest is value is"+ low);

    }

     static void highest( ArrayList<Integer> grade) {
        int high ;

         high= grade.getFirst();
         for (int one : grade) {

             if (high <= one)
                 high = one;
         }
        System.out.println("highest value is " + high);

    }

    static void average( ArrayList<Integer> grade ) {
        int a  =grade.size();
        int b=0;
        int c;
        for (int one : grade) {
            b += one;
        }
        c=b/a;
        System.out.println(c);

    }

    static void show(ArrayList<String> name , ArrayList<Integer> grade) {
        int a = name.size();
        for (int i = 0; i<a; i++) {
            System.out.print(name.get(i)+":");
            System.out.println(grade.get(i));
        }

    }

    static void add(ArrayList<String>name , ArrayList<Integer> grade , String s , int i) {
        name.add(s);
        grade.add(i);

    }



}
