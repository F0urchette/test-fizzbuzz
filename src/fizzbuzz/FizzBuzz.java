package fizzbuzz;

public class FizzBuzz {
	static int[] valeursSpeciales = {3, 5};
	static String[] motsSpeciaux = {"fizz", "buzz"}
	public static Object fizzbuzz(int i) {
		String resultat = "";
		if (i%3==0)
			resultat = resultat.concat("fizz");
		if (i%5==0)
			resultat = resultat.concat("buzz");
		if (resultat.isEmpty())
			return Integer.toString(i);
		return resultat;
	}

}
