enum level {
    low,medium,high
}
public class EnumExample {
    public static void main(String[] args) {
        level myVar = level.medium;
        switch(myVar) {
            case low: {
                System.out.println("low level");
                break;
            }
            case medium: {
                System.out.println("medium level");
                break;
            }
            case high: {
                System.out.println("high level");
                break;
            }
        }
    }
}
