public class Q4 {
    public static void main(String[] args) {
        boolean flag = true;
        Boolean obj = flag; //AutoBoxing
        System.out.println("Boolean Object: "+ obj);
        boolean flag1 = false;
        Boolean obj1 = new Boolean(flag1);
        System.out.println("Boolean Object: "+obj1);
    }
}
