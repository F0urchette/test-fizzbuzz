package fizzbuzz;

public class FizzBuzz {
	public static Object fizzbuzz(int i) {
		String resultat = "";
		if (i%3==0)
			resultat.concat("fizz");
		if (i%5==0)
			resultat.concat("buzz");
		return Integer.toString(i);
	}

}
