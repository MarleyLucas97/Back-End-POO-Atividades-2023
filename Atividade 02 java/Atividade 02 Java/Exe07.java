import java.util.Scanner;

public class Exe07{
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        char sexo;
        double altura, peso;

        System.out.println("Digite o sexo: f- feminino      m- masculino");
        sexo=leia.nextLine().charAt(0);

        System.out.println("Digite sua altura: ");
        altura=leia.nextDouble();

        if(sexo=='f'){
            peso=(62.1*altura)-44.7;
            System.out.printf("O peso ideal e de: %f",peso);
        }else if(sexo=='m'){
            peso=(72.7*altura)-58;
            System.out.printf("O peso ideal e de: %f",peso);
        }else{
            System.out.println("Ocorreu algum erro.");
        }
    }
}