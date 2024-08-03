import java.util.*;

public class ifcase {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
       int m1,m2,m3;
       System.out.println("enter marks of English:");
           m1=sc.nextInt();
           System.out.println("enter marks of Hindi:");
           m2=sc.nextInt();
           System.out.println("enter marks of Maths:");
           m3=sc.nextInt();
           float avg= (m1+m2+m3)/0.3f;

           if(avg>=40 && m1>=33 && m2>=33 && m3>=33 ){
            System.out.println("PASS");
           }
           else{
            System.out.println("FAIL");
           }
        }
    }







    //     int age;
        // @SuppressWarnings("resource")
        // Scanner scan = new Scanner(System.in);
        
        // double d = scan.nextDouble();
        // int i = scan.nextInt();
        // String s = scan.nextLine();

        // System.out.println("String: " + s);
        // System.out.println("Double: " + d);
        // System.out.println("Int: " + i);
    //     Scanner sc = new Scanner(System.in);
    //         age=sc.nextInt();
        
    //     if (age>=18) {
    //         System.out.println("Eligible");   
    //     }
    //     else{
    //         System.out.println("non-eligible");
    //     }
    // }
