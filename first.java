import java.util.Scanner;
public class first {
    public static void main (String[] args){
        Scanner num= new Scanner(System.in);
        System.out.println("Enter a number you want to increase");
        int a= num.nextInt();
        System.out.print("preincrement a=");
        System.out.println(++a);
        System.out.println("Enter a number you want to decrease");
        int b= num.nextInt();
        System.out.print("predecrement b=");
        System.out.println(--b);
        System.out.println("Enter a number you want to decrease");
        System.out.print("postincrement a=");
        System.out.println(a++);

        System.out.print("postdecrement b=");
        System.out.println(b--);
    }

}
