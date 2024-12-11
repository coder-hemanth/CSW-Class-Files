public class program2 {
	public static void main(String[]args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = "hello";
		System.out.println("Comparing addresses :");
		System.out.println("str1 == str2 : "+ (str1 == str2));
		System.out.println("str1 == str3 : "+ (str1 == str3));
		System.out.println("Comparing elements :");
		System.out.println("str1.equals(str2) : "+ (str1.equals(str2)));
		System.out.println("str1.equals(str3) : "+ (str1.equals(str3)));
		System.out.println("Case insensitive comparision :");
		System.out.println("str1.equalsIgnoreCase(str4) :"+ str1.equalsIgnoreCase(str4));
		System.out.println("Comparing using compareTo :");
		System.out.println("str1.compareTo(str2) :"+ str1.compareTo(str2));
		System.out.println("str1.compareTo(str4) :"+ str1.compareTo(str4));
		System.out.println("str4.compareTo(str1) :"+ str4.compareTo(str1));
	}
}