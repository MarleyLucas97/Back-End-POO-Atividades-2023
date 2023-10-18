import java.util.Scanner;

public class At10 {
public static void main(String[] args) {
    
    Scanner leia = new Scanner(System.in);

    double preco=0, valor=0, troco=0;

    System.out.printf("Digite o valor a ser pago: %n");
    valor=leia.nextDouble();

    System.out.printf("Digite o preco do produto: %n");
    preco=leia.nextDouble();

    troco=valor-preco;
    System.out.printf("Troco e de R$%f", troco);
    }    
}
