import java.util.Arrays;

public class Generics {	
	public static <T extends Comparable<T>>
	int findMatch(T[] array, T val) {
		int isMatch = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].compareTo(val) == 0) {
				isMatch = i;
				break;
			}
			
			else {
				isMatch = -1;
			}
		}
		
		return isMatch;
	}
}
