package fundamentos;

public class tipoString {

	public static void main(String[] args) {
		System.out.println("Olá, pessoal");
		
		String s = "Boa tarde";
		s = "Bom dia";
		//uma das formas de concatenar usando anotação ponto
		System.out.println(s.concat("!!!"));
		// a mesmoa operação que acima apenas concatenando
		System.out.println(s + "!!");
		// retorna true ou false para a palavra que está começando a setença
		System.out.println(s.startsWith("Boa"));
		// informa a quantidade de caracter
		System.out.println(s.length());
		// verifica se a setença é igual a sentença que foi passada
		System.out.println(s.equals("Bom dia"));
		//ignora se a sentença está sendo escrita maiúscula ou minuscula
		System.out.println(s.equalsIgnoreCase("BOM DIA"));
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 22;
		var salario = 12.3482;
		// O \n serve para pular uma linha
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome +
				"\nIdade: " + idade + "\nSalário: " + salario);
		System.out.printf("Nome: %s %s tem %d anos e ganha R$%f ", nome, sobrenome, idade, salario);
	}
}
