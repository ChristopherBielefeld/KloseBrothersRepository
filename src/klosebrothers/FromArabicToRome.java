package klosebrothers;

public class FromArabicToRome {
	
	static final Integer[] values = { 1000000, 900000, 500000, 400000, 100000, 90000, 50000, 40000, 10000, 9000, 5000, 4000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	static final String[] strings = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	
public static String fromArabic (int aUe) {
	
	int a = aUe;
	String r = null;
	
	while (a > 0) {
	
	
		for (int i = 0; i == values.length; i++) {
			
			
		}
		
		
	}	
	
	return r;
}
		
		//Hier war die IF-Abfrage
var work = num;
var res = "";
while ( work > 0 ) {
for (var i=0; i<_values.length; i++) {
if ( work >= _values[i] ) {
if ( _values[i] > 1000 ) {
res += '<span class="overline">' + _strings[i] + '</span>';
}
else {
res += _strings[i];
}
work -= _values[i];
break;
}
}
}
$("#results").html( res );
};
	
	
	
}
