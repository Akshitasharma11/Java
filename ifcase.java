import java.util.*;

public class ifcase {
    public static void main(String[] args) {
        int age;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        // System.out.println("age=");
            age=sc.nextInt();
        
        if (age>=18) {
            System.out.println("Eligible");   
        }
        else{
            System.out.println("non-eligible");
        }
    }
}