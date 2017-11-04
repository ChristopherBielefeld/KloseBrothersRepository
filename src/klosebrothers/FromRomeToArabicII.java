package klosebrothers;

public class FromRomeToArabicII {
	 	//Methode convertRec ueberprueft die vordeste/vorderen zwei roemischen Ziffern, bestimmt den arabischen Wert dazu und ruft sich dann (rekrusiv), um mit den naechsten forzufahren.
	    private static int convertRec(String r) {
	        if (r.isEmpty()) return 0;
	             if (r.startsWith("M"))  return 1000 + convertRec(r.substring(1));
	        else if (r.startsWith("CM")) return 900  + convertRec(r.substring(2));
	        else if (r.startsWith("D"))  return 500  + convertRec(r.substring(1));
	        else if (r.startsWith("CD")) return 400  + convertRec(r.substring(2));
	        else if (r.startsWith("C"))  return 100  + convertRec(r.substring(1));
	        else if (r.startsWith("XC")) return 90   + convertRec(r.substring(2));
	        else if (r.startsWith("L"))  return 50   + convertRec(r.substring(1));
	        else if (r.startsWith("XL")) return 40   + convertRec(r.substring(2));
	        else if (r.startsWith("X"))  return 10   + convertRec(r.substring(1));
	        else if (r.startsWith("IX")) return 9    + convertRec(r.substring(2));
	        else if (r.startsWith("V"))  return 5    + convertRec(r.substring(1));
	        else if (r.startsWith("IV")) return 4    + convertRec(r.substring(2));
	        else if (r.startsWith("I"))  return 1    + convertRec(r.substring(1));
	        throw new IllegalArgumentException("Fehler bei der Eingabe. Nur folgende Werte valide: M, D, C, X, L, I, V");
	    }
	    //Ueberprueft, ob die roemische Ziffer valide ist, bevor die convertRec Methode aufgerufen wird.
	    public static int convert(String r) {
	        if (r == null || r.isEmpty() || !r.matches("^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"))
	            return -1;
	        return convertRec(r);
	    }
	 	//erstellt die Variable "a" zum Speichern der arabischen Zahl. Ruft dann convert auf. Gibt daraufhin den Wert aus.
		private static void printRomanToDecimal(String r) {
		    int a = convert(r);
		    String output = a != -1 ? ""+a : "Invalide roemische Ziffer";
		    System.out.println(r + ": " + output);
		}
	}


