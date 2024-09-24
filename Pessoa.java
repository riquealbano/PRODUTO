public class Pessoa {
	// A lição possuia um desafio ao incluir data mas pesquisei e não entendi muito bem (tirar duvida)
	
	// Defino os atributos
	String nome;
	double altura;
	int data;
	String email;
	
	// Contrutor
	public Pessoa(String nome, double altura) {
		this.nome = nome;
		this.altura = altura;
		this.email = EmailPadrao();
	}
	
	// Parâmetro padrão para email quando não fornecido. Usei de referência modelo apresentado em aula
	private String EmailPadrao(){
		String[] nomes = this.nome.split(" ");
		return nomes[0]+"."+nomes[nomes.length-1]+"@mail.com";
	}
	
	// Não consegui outra forma de fazer fundionar o print, tive de usar o chatgpt
    public String toString() {
        return "Nome: " + this.nome + ", Altura: " + this.altura + ", Email: " + this.email;
	}

    public static void main(String[] args) {

            // Criando objetos da classe Pessoa
            Pessoa p1 = new Pessoa("Henrique Albano", 1.87);
            Pessoa p2 = new Pessoa("Eliana Serafim", 1.61);
            Pessoa p3 = new Pessoa("Halana Freire", 1.58);
      
            // Printando os objetos no console
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
    }
}