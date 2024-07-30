package StaticBlock;


public class StaticBlockAssignment002 {
    static int x = 10;
    static int y = 25;
    public static void main(String[] args) {
        int a = x + y;
        int b = x - y;
        int c = x * y;
        int d = x / y;
        System.out.printf("Sum of %d and %d is %d",x,y,a);
        System.out.printf("subtraction of %d and %d is %d",x,y,b);
        System.out.printf("multliplication of %d and %d is %d",x,y,c);
        System.out.printf("division of %d and %d is %d",x,y,d);
    }
}
