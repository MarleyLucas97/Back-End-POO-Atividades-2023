import java.util.Scanner;

public class Exe05 {
   public static void main(String[] args) {
    Scanner leia=new Scanner(System.in);

    char turno;

    System.out.printf("Digite o turno: %nm      v       n%n");
    turno=leia.nextLine().charAt(0);

    if(turno=='m'){
        System.out.println("Bom Dia!");
    }else if(turno=='v'){
        System.out.println("Boa Tarde!");
    }else if(turno=='n'){
        System.out.println("Boa Noite!");
    }else{
        System.out.println("Valor Invalido!");
    }
   } 
}
