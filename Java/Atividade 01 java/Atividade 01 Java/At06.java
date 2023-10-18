import java.util.Scanner;

public class At06{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int n1,n2,cal;

        System.out.println("Digite o primeiro numero: ");
        n1=leia.nextInt();

        System.out.println("Digite o segundo numero: ");
        n2=leia.nextInt();

        cal=(n1+n2)*n1;
        System.out.printf("O resultado da soma de %d com %d e multiplicado com %d deu %d.",n1,n2,n1,cal);
    }
}