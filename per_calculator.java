import java.util.Scanner;

public class per_calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for English");
        float marks1=sc.nextFloat();
        System.out.println("Enter marks for Hindi");
        float marks2=sc.nextFloat();
        System.out.println("Enter marks for Maths");
        float marks3=sc.nextFloat();
        System.out.println("Enter marks for Science");
        float marks4=sc.nextFloat();
        System.out.println("Enter marks for Social Studies");
        float marks5=sc.nextFloat();

        // float percentage=per.nextFloat();
        float sum=marks1+marks2+marks3+marks4+marks5;
        float percentage=sum/500*100;
        System.out.println("Percentage:"+ percentage);
    }
}
