import java.util.*;
public class HcfLcm {
    public int calculateHcf(int num1, int num2) {
        while(num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }
    public static int calculateLcm(int num1, int num2, int hcf) {
        return ((num1*num2)/hcf);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        HcfLcm demo = new HcfLcm();
        int hcf = demo.calculateHcf(num1, num2);
        int lcm = calculateLcm(num1, num2, hcf);
        System.out.println("hcf is "+ hcf);
        System.out.println("lcm is "+ lcm);
    }
}
