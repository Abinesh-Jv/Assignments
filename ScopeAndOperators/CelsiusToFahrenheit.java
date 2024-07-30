
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Celcius : ");
        int celcius = sc.nextInt();
        System.out.println(celtofar(celcius));
    }
    static int celtofar(int cel){
        return cel*9/5+32;
    }
}