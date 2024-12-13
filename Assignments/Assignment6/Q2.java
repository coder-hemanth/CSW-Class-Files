public class Q2 {
    public static void main(String[] args) {
        float num = 5.5f;
        Float obj = num; // AutoBoxing
        System.out.println("Float Object: " + obj);
        float num1 = 5.5f;
        Float obj1 = new Float(num1); // using constructor
        System.out.println("Float Object: " + obj1);
    }
}
