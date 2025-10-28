package h3;

public class H3_main {
	public static void main(String[] args) {
		int i, j, k;
		i = 140;
		j = 150;
		k = 0;

		// k=1 Nur Ausdruck 1 wahr
		if (i > j && i <= 200 && j <= 100) {
			k = 1;
		}
		// k=2 Nur Ausdruck 1 & 2 wahr
		else if (i > j && i > 200 && j <= 100) {
			k = 2;
		}
		// k=3 Ausdruck 1 & 2 & 3 wahr
		else if (i > j && i > 200 && j > 100) {
			k = 3;
		}
		//k=4 wenn alle Ausdrücke falsch sind
		else if (i <= j && i <= 200 && j <= 100) {
			k = 4;
		}
		else
		{
			k = -10;
		}
		
		System.out.println(k);
	}

}
