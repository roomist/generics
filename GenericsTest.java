import java.util.Arrays;

public class GenericsTest {

	public static void main(String[] args) {
		String[] strings = {"pies", "explosions", "eggplants", "horseshoes"};
		Integer [] ints = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
		Double [] doubles = {1.11, 1.22, 1.56, 44.56, 4.3, 93331.1};
		String stringSelect = "explosions";
		int intsSelect = 14;
		double doublesSelect = 93331.1;
		double invalidDoublesSelect = 1.01;
		
		System.out.println("String array:");
		
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		System.out.println("\nI will find the index position of: " + stringSelect);
		
		System.out.println("\nIndex position: " + Generics.findMatch(strings, stringSelect));
		
		System.out.println("\nInteger array:");
		
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
		
		System.out.println("\nI will find the index position of: " + intsSelect);
		
		System.out.println("\nIndex position: " + Generics.findMatch(ints, intsSelect));
		
		System.out.println("\nDouble array:");
		
		for (int i = 0; i < doubles.length; i++) {
			System.out.println(doubles[i]);
		}
		
		System.out.println("\nI will find the index position of: " + doublesSelect);
		
		System.out.println("\nIndex position: " + Generics.findMatch(doubles, doublesSelect));
		
		System.out.println("\nI will perform this invalid index position check on the double array: " + invalidDoublesSelect);
		
		System.out.println("\nIndex position: " + Generics.findMatch(doubles, invalidDoublesSelect));
		
		
	}
	
}
