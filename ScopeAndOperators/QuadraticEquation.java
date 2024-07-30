
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();
        int[] solutions = quadratic(a, b, c);
        for(int i:solutions){
            System.out.println(i);
        }


    }

    public static  int[] quadratic(int a,int b,int c){
        int soln1 = -b+(b*b-4*a*c)/2*a;
        int soln2 = -b-(b*b-4*a*c)/2*a;
        return new int[]{soln1,soln2};
    }
}