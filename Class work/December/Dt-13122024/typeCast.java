public class typeCast {
    public static void main(String[] args) {
        int x = 5;
        double y = x;
        System.out.println("Implicit/widening from integer: " + x + " to double: " + y);
        double a = 25.2;
        int b = (int) a;
        System.out.println("Explicit/narrowing from double: " + a + " to int: " + b);
    }
}
