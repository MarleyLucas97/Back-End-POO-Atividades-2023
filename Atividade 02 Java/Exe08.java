import java.util.Scanner;
import java.lang.Math;

public class Exe08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int opc=0, n1=0, n2=0, cal=0;
        double n3=0, n4=0;

        System.out.println("1-Soma 2-Raiz Quadrada");
        opc=leia.nextInt();

        if(opc==1){
            System.out.println("Digite o primeiro numero: ");
            n1=leia.nextInt();

            System.out.println("Digite o segundo numero: ");
            n2=leia.nextInt();

            cal=n1+n2;

            System.out.printf("A soma de %d com %d e %d.%n",n1,n2,cal);
        }else if(opc==2){
            System.out.println("Digite o numero: ");
            n3=leia.nextDouble();
            
            n4= Math.sqrt(n3);

            System.out.printf("A raiz quadrada e %.2f.", n4);
        }else{
            System.out.println("Erro");
        }
    }    
}
