import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        int n1=0, n2=0;

        System.out.println("Digite o primeiro numero: ");
        n1=leia.nextInt();

        System.out.println("Digite o segundo numero: ");
        n2=leia.nextInt();

        if(n1>n2){
            System.out.printf("%d e maior que %d.%n", n1,n2);
        }else if(n2>n1){
            System.out.printf("%d e maior que %d.%n", n2, n1);
        }else{
            System.out.println("Os numeros sao iguais.");
        }
    } 
}