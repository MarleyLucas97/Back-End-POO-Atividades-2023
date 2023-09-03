import java.util.Scanner;

public class At11 {
  public static void main(String[] args) {

    Scanner leia= new Scanner(System.in);
    
    double quilosValor=10.5, quiloConsumido=0, total=0; 

    System.out.printf("Digite a quantidade de quilos consumidos: %n");
    quiloConsumido=leia.nextDouble();

    total=quiloConsumido*quilosValor;
    System.out.printf("O total a se pagar e de: R$%f%n", total);
  }  
}
