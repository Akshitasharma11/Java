import java.util.Scanner;;
public class max {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers to find max");
        int a= sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
        System.out.print("max number=");
        System.out.println(a);
    }
    else{
        System.out.print("max number=");
        System.out.println(b);
    }
    }
}
