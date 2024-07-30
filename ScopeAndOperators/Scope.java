public class Scope {
    public static void main(String[] args) {
        int num = 5;
        if(true){
            int localnum = 7;
            System.out.println(num);
            System.out.println(localnum);
            
        }
        System.out.println(num);
        System.out.println(localnum);  //error
    }
}