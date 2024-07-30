class TestClass1 {
    static int number = 1;
}
class TestClass2 {
    static int number = 2;
}
class TestClass3 {
    static int number = 3;
}
public class MultipleClass {
    public static void main(String[] args) {
        System.out.println(TestClass1.number);
        System.out.println(TestClass2.number);
        System.out.println(TestClass3.number);
    }
}