package klosebrothers;

public class RomanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( fromRoman("V") + " Test durchlaufen");

	}

	// Der Methode "fromRoman" wird eine römische Zahl übergeben. Die Zahl wir als
	// arabische Zahl zurück geben.
	public static int fromRoman(String r) {

		int a = 0; // int a repraesentiert die arabische Zahl, die ermittelt wird.
		char next; // naechste roemische Ziffer
		char prev; // vorherige roemische Ziffer

		for (int i = 0; i < r.length(); i++) {

			char c = Character.toLowerCase(r.charAt(i)); // Der naechste Buchstabe in der römischen Zahl wird isoliert
															// betrachtet.

			if (i < (r.length() - 1)) { // Naechste roemische Ziffer wird, falls vorhanden, gesichert.

				next = Character.toLowerCase(r.charAt(++i));
			}

			else {

				next = ' ';

			}

			if (i > 0) { // Vorheriger roemische Ziffer wird, falls vorhanden, gesichert
				prev = Character.toLowerCase(r.charAt(--i));
			} else {
				prev = ' ';

			}

			if (c == 'i') {
				if (next == 'v')
					a += 4;
				else if (next == 'x')
					a += 9;
				else
					a += 1;
				continue;
			}

			if (c == 'v') {
				if (prev != 'i')
					a += 5;
				continue;
			}

			if (c == 'x') {
				if (prev != 'i')
					if (next == 'l')
						a += 40;
					else if (next == 'c')
						a += 90;
					else
						a += 10;
				continue;
			}
			if (c == 'l') {
				if (prev != 'x')
					a += 50;
				continue;
			}

			if (c == 'c') {
				if (prev != 'x')
					if (next == 'd')
						a += 400;
					else if (next == 'm')
						a += 900;
					else
						a += 100;
				continue;
			}

			if (c == 'd') {
				if (prev != 'c')
					a += 500;
				continue;
			}

			if (c == 'm') {
				if (prev != 'c')
					a += 1000;
				continue;

			}

		}
		return a;
	}
}
