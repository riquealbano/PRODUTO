public class Produto {
    String nome;
    String marca;
    double pdc; // poder de compra
    double pdv; // poder de venda

    // Construtor
    public Produto(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    // Método para calcular
    public double calculo(double pdc, double pdv) {
        return pdv - pdc;
    }

    public static void main(String[] args) {
        // Instanciação de 4 produtos
        Produto p1 = new Produto("Macarrão", "Adria");
        Produto p2 = new Produto("Celular", "Samsung");
        Produto p3 = new Produto("Leite", "Italac");
        Produto p4 = new Produto("Arroz", "Camil");

        // Cálculo e exibição dos resultados com o nome de cada produto
        double result1 = p1.calculo(2.99, 3.99);
        double result2 = p2.calculo(1250.90, 1990.99);
        double result3 = p3.calculo(1.29, 3.20);
        double result4 = p4.calculo(6.98, 10.54);
        System.out.println("Resultado do lucro de uma venda do produto " + p1.nome + ": " + result1);
        System.out.println("Resultado do lucro de uma venda do produto " + p2.nome + ": " + result2);
        System.out.println("Resultado do lucro de uma venda do produto " + p3.nome + ": " + result3);
        System.out.println("Resultado do lucro de uma venda do produto " + p4.nome + ": " + result4);
	}
}
