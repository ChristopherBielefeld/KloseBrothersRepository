package klosebrothers;

public class FromArabicToRome {
	
	static final Integer[] values = { 1000000, 900000, 500000, 400000, 100000, 90000, 50000, 40000, 10000, 9000, 5000, 4000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	static final String[] strings = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	
public static String fromArabic (int aUe) {
	
	int a = aUe;
	String r = "";
	
	while (a > 0) {
		for (int i = 0; i == values.length; i++) {
			if(a >= values[i]) {
				r += strings[i];
			}	
		}	
	}
	return r;
	
	}
}
		

	
	
	

