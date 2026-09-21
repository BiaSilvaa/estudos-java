package fundamentos;

public class ConversaoTipoPrimitivosNumerico {
	public static void main(String[] args) {
		// Java não análise valor, apenas tipo
		//Conversão implícita
		double a = 1;
		System.out.println(a);
		
		//Fazendo casting (CAST), fazendo de forma explicita
		float b = (float) 1.234;
		System.out.println(b);
		
		
		int c = 4;
		byte d = (byte)c;//CAST explícito
		System.out.println(d);
		
		double e = 1.0;
		int f = (int) e; //CAST explícito
		System.out.println(f);
	}
}
