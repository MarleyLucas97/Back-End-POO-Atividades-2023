import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
    
        Scanner leia = new Scanner(System.in);

        double n1=0, n2=0, n3=0, med=0;
        String nome="";

        System.out.println("Digite o nome do aluno: ");
        nome=leia.nextLine();

        System.out.println("Digite a primeira nota: ");
        n1=leia.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2=leia.nextDouble();

        System.out.println("Digite a terceira nota: ");
        n3=leia.nextDouble();

        med=(n1+n2+n3)/2;

        if(med>=7){
            System.out.printf("O aluno %s foi %s e a media foi de %2f.",nome, "Aprovado", med);        
        }else if(med<=4){
            System.out.printf("O aluno %s foi %s e a media foi de %2f.", nome, "Reprovado", med);
        }else if(med>=4.1 || med<=6.9){
            System.out.printf("O aluno %s esta de %s e a media foi de %2f.", nome, "Recuperacao", med);
        }else{
            System.out.println("Notas invalidas.");
        }
    }
}