// package Java;
import java.util.Scanner;

public class per_calculator {
    public static void main(String[] args){
        Scanner per= new Scanner(System.in);
        System.out.println("Enter marks for English");
        float marks1=per.nextFloat();
        System.out.println("Enter marks for Hindi");
        float marks2=per.nextFloat();
        System.out.println("Enter marks for Maths");
        float marks3=per.nextFloat();
        System.out.println("Enter marks for Science");
        float marks4=per.nextFloat();
        System.out.println("Enter marks for Social Studies");
        float marks5=per.nextFloat();

        // float percentage=per.nextFloat();
        float sum=marks1+marks2+marks3+marks4+marks5;
        float percentage=sum/500*100;
        System.out.println("Percentage:"+ percentage);
    }
}
