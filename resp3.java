import java.util.Scanner;

/** Classe base para descontos (aberta para extensões) */
class Discount {
    public double calculateDiscount(double originalValue) {
        return originalValue; // Sem desconto padrão
    }
}

/** Classe derivada para desconto de estudante (10%). */
final class StudentDiscount extends Discount {
    @Override
    public double calculateDiscount(double originalValue) {
        return originalValue * 0.9; // Aplicando desconto de 10% para estudantes
    }
}

/** Classe derivada para desconto de afiliado (15%). */
final class MembershipDiscount extends Discount {
    @Override
    public double calculateDiscount(double originalValue) {
        return originalValue * 0.85; // Aplicando desconto de 15% para afiliados
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String discountType = scanner.next();
            double originalValue = scanner.nextDouble();

            // Aplicação OCP: Criando uma instância com base no tipo de desconto fornecido
            Discount discount = null;
            switch (discountType) {
                case "student":
                    discount = new StudentDiscount();
                    break;
                case "membership":
                    discount = new MembershipDiscount();
                    break;
                default:
                    System.out.println("Tipo de desconto inválido.");
                    System.exit(1);
            }

            double discountValue = discount.calculateDiscount(originalValue);
            System.out.printf("%.2f\n", discountValue);
        }
    }
}
