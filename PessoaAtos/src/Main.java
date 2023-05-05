
public class Main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Pedro";
		pessoa1.idade = 12;
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Carlos";
		pessoa2.idade = 25;
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.nome = "Jéssica";
		pessoa3.idade = 19;
		
		System.out.println("O nome da Pessoa 1 é: " + pessoa1.nome + ", e sua idade é: " + pessoa1.idade);
		System.out.println("O nome da Pessoa 2 é: " + pessoa2.nome + ", e sua idade é: " + pessoa2.idade);
		System.out.println("O nome da Pessoa 3 é: " + pessoa3.nome + ", e sua idade é: " + pessoa3.idade);
	}

}
