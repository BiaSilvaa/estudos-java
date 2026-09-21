package fundamentos;

public class temperatura {
	public static void main(String[] args) {
		final double tempFaren = 86;
		int Faren = 32;
		double div = 5.0/9;
		
		final double celsius = (tempFaren - Faren) * div ;
		
		System.out.println("A temperatura em celsius é: " + celsius);
	}
}
