package fundamentos;

public class tiposPrimitivos {
	public static void main(String[] args) {
		//informações do funcionário
		
		//tipos numéricos inteiros
		
		byte anosEmpresa = 23;
		short numeroVoos = 542;
		int id = 84728;
		long pontosAcumulados = 1_234_845_324;
		
		//tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_849_489_843.01;
		
		boolean estarFerias = false;
		
		
		char status = 'a'; //ativo
		
		
		System.out.println(anosEmpresa * 365);
		System.out.println(numeroVoos / 2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + " : ganha -> " + salario);
		System.out.println("Férias? : " + estarFerias);
		System.out.println(status + "status");
		
		
		
	}
}
