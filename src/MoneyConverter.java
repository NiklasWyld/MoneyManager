public class MoneyConverter {
	// Attention, the values must be updated manually.
	static Double dollar_euro = 0.91;
	static Double euro_dollar = 1.10;
	
	public static Integer euro_to_dollar(int euro) {
		Integer ergebnis = (int) (euro * euro_dollar);
		
		return ergebnis;
	}
	
	public static Integer dollar_to_euro(int dollar) {
		Integer ergebnis = (int) (dollar * dollar_euro);
		
		return ergebnis;
	}
}
