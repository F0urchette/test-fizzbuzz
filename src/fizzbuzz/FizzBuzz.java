package fizzbuzz;

public class FizzBuzz {
	public static Object fizzbuzz(int i) {
		String resultat = "";
		System.out.println(resultat.length());
		if (i%3==0)
			resultat.concat("fizz");
		if (i%5==0)
			resultat.concat("buzz");
		if (resultat.isEmpty())
			return Integer.toString(i);
		return resultat;
	}

}
