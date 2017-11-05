package klosebrothers;


public class FromArabicToRome {
	
	public static String fromArabic(int a) {
	
	 int[] arabic = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
	  String[] roman = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
	  String r = "";
	  
	  for ( int i = arabic.length - 1; a > 0;){
	    
	    if (a - arabic[i] >= 0) {
				r += roman[i];
				a = a - arabic[i];
	    }
	    else
	      i--;
	  }
	  return r;
	}
	//Ueberprueft, ob die Eingabe ein Integer ist
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public static int fromArabic(String eingabe ) {

int[] arabic = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
String[] roman = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

int summe = 0;


for (int j = 0; j <= eingabe.length() - 1; ){
  
  for ( int i = roman.length - 1; i >= 0 && j <= eingabe.length() - 1 ; ){
    
    if (roman[i].length() == 1 ){
      if ( (j <= eingabe.length() - 1) && ((eingabe.substring(j , j + 1)).equals(roman[i]))  ) {
        summe = summe + arabic[i];
        j = j + 1;
      }
      else
        i--;
      
    }
    else if (roman[i].length() == 2 ) {
      if (  (j < eingabe.length() - 1) && ( (eingabe.substring(j , j + 2)).equals(roman[i]) ) ){
        summe = summe + arabic[i];
        j = j + 2;
      }
      else
        i--;
      
    }
    
  }
}

return summe;
}}








*/




/*
public class FromArabicToRome {
	
	static final Integer[] values = { 1000000, 900000, 500000, 400000, 100000, 90000, 50000, 40000, 10000, 9000, 5000, 4000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	static final String[] strings = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	
public static String fromArabic (int aUe) {
	
	int a = aUe;
	String r = "";
	
	while (a > 0) {
		for (int i = 0; i < values.length; i++) {
			if(a >= values[i]) {
				r += strings[i];
			}
		a -= values[i];	
		break;
		}	
	}
	return r;
	
	}
}
		

	
	
	

*/