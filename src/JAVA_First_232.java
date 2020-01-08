import java.util.Scanner;
public class JAVA_First_232 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num;
        int counter =1;
        System.out.println("Write a number between 1 and 100");
        num = ent.nextInt();
        System.out.println("---------------------");
        System.out.println("|"+"Multiplication table of "+ num+"|" );
        System.out.println("---------------------");

        if(num<100) {
            for(counter =1; counter<=10;counter++) {
                int multTable [] = new int [10];
                multTable [counter-1] = num * counter;
                System.out.printf("| %02d x %02d |\t %02d  |\n"  , num, counter, multTable[counter-1]);
            }
        }
        else{
            System.out.println("Please enter a value between 1 and 100!");
        }

        System.out.print("---------------------");

    }

}
