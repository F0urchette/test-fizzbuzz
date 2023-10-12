package fizzbuzz;

public class FizzBuzz {
	static int[] valeursSpeciales = {3, 5};
	static String[] motsSpeciaux = {"fizz", "buzz"};
	
	public static String fizzbuzz(int entree) {
		StringBuilder resultat = new StringBuilder();
		
		for (int i = 0; i < valeursSpeciales.length; i++) {
			if (entree % valeursSpeciales[i] == 0)
				resultat.append(motsSpeciaux[i]);
		}
		
		if (resultat.isEmpty())
			return Integer.toString(i);
		return resultat;
	}

}
