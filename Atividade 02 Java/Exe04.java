import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double nota=0, nota2=0, media=0;

        System.out.println("Digite a primeira nota: ");
        nota=leia.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2=leia.nextDouble();

        media=(nota+nota2)/2;

        if(media==10){
            System.out.printf("O Aluno foi Aprovado com Distincao! media %f.", media);
        }else if(media>=7 && media<10){
        System.out.printf("O Aluno foi Aprovado com media %f.", media);    
        }else if(media<7 && media>=4){
            System.out.printf("O Aluno esta de Recuperacao com media %f.", media);
        }else if(media<4 && media>0){
            System.out.printf("O Aluno foi Reprovado com media %f.", media);
        }else{
            System.out.println("Erro inesperado. Digite notas validas.");
        }
    }
}
