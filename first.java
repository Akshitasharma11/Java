import java.util.Scanner;
public class first {
    public static void main (String[] args){
        @SuppressWarnings("resource")
        Scanner num= new Scanner(System.in);
        System.out.println("Enter a number you want to increase");
        int a= num.nextInt();
        System.out.println("Enter a number you want to decrease");
        int b= num.nextInt();
        System.out.print("a=");
        System.out.println(++a);
        System.out.print("b=");
        System.out.println(--b);
    }

}
