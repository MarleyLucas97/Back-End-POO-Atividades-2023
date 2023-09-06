import java.util.Scanner;
public class Exe11 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        int dia=0;
        System.out.println("Digite um numero: ");
        dia=leia.nextInt();

        switch(dia){
            case 1 :
            System.out.println("Segunda.");
            break;
            case 2 :
            System.out.println("Terca.");
            break;
            case 3 :
            System.out.println("Quarta.");
            break;
            case 4 :
            System.out.println("Quinta.");
            break;
            case 5 :
            System.out.println("Sexta.");
            break;
            case 6 :
            System.out.println("Sabado.");
            break;
            case 7 :
            System.out.println("Domingo.");
            break;
            default : 
            System.out.println("Valor invalido.");
            break;
        }
    }
}
