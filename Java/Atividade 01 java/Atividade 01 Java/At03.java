import java.util.Scanner;
public class At03 {
    public static void main(String[] args) {
        
        Scanner leia=new Scanner(System.in);

        String nome, sobrenome, endereco, mes;
        int numCasa, dia, ano, idade;
        double peso, altura;

        System.out.println("Digite seu nome: ");
        nome=leia.nextLine();

        System.out.println("Digite seu sobrenome: ");
        sobrenome=leia.nextLine();

        System.out.println("Digite o nome da sua rua: ");
        endereco=leia.nextLine();

        System.out.println("Digite o numero da casa: ");
        numCasa=leia.nextInt();

        System.out.println("Digite o dia de nascimento: ");
        dia=leia.nextInt();

        System.out.println("Digite o mes de nascimento: ");
        mes=leia.nextLine();

        System.out.println("Digite o ano de nascimento: ");
        ano=leia.nextInt();

        System.out.println("Digite seu peso: ");
        peso=leia.nextDouble();

        System.out.println("Digite sua altura: ");
        altura=leia.nextDouble();

        System.out.println("Digite sua idade: ");
        idade=leia.nextInt();
    }
}
