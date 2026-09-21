package fundamentos;

public class Import {
	public static void main(String[] args) {
		int somaPares = 0;
		
		for (int i=0; i<10; i++) {
			if(i%2==0) {
				somaPares+=i;
			}
		}
	}
}
