import java.util.Scanner;

/** LSP: Classe base representando um polígono. */
abstract class Poligono {
    abstract int calcularArea();
}

/** LSP: Classe derivada para retângulos */
class Retangulo extends Poligono {
    protected int largura;
    protected int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public int calcularArea() {
        return largura * altura;
    }
}

/** LSP: Classe derivada para quadrados, herdando de Retangulo */
class Quadrado extends Retangulo {
    public Quadrado(int lado) {
        super(lado, lado); // Quadrado é um caso especial de Retangulo com largura e altura iguais
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] entradas = scanner.nextLine().split(", ");
            String tipoForma = entradas[0];

            Poligono poligono;
            if (tipoForma.equals("retangulo")) {
                int largura = Integer.parseInt(entradas[1]);
                int altura = Integer.parseInt(entradas[2]);
                poligono = new Retangulo(largura, altura);
            } else if (tipoForma.equals("quadrado")) {
                int lado = Integer.parseInt(entradas[1]);
                poligono = new Quadrado(lado);
            } else {
                throw new IllegalArgumentException("Tipo de forma inválido.");
            }
            int area = poligono.calcularArea();
            System.out.println(area);
        }
    }
}
