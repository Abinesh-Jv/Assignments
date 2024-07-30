package StaticBlock;

import java.util.Scanner;

public class StaticBlockAssignment001 {

    static String username = "Abinesh";
    static String password = "1234567890";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Username : ");
        String inputUsername = sc.nextLine();
        System.out.print("Password : ");
        String inputPassword = sc.nextLine();
        if (inputUsername.equals(username)) {
            System.out.print("Correct username");
            if (password.equals(inputPassword)) {
                System.out.print(" and Correct Password ");
            }
            else{
                System.out.println(" and Wrong Password");
            }
        }else {

            System.out.println("Incorrect username");
        }
    }
}