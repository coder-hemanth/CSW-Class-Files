public class Q1 {
    public static void main(String[] args) {
        int num = 10;
        Integer obj = num; // AutoBoxing
        System.out.println("Integer Object: " + obj);
        int num1 = 20;
        Integer obj1 = new Integer(num1); // using constructor
        System.out.println("Integer Object: " + obj1);
        System.out.println(obj1 instanceof Integer);
    }
}