import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {
    
        Scanner leia = new Scanner(System.in);
    
        double peso=0, alt=0, imc=0;

        System.out.println("Digite o seu peso: ");
        peso=leia.nextDouble();

        System.out.println("Digite sua altura: ");
        alt=leia.nextDouble();

        imc=peso/(alt*alt);

        if(imc<18.5 && imc>1){
            System.out.println("Peso abaixo do normal.");
        }else if(imc>=18.5 && imc<=24.9){
            System.out.println("Peso normal.");
        }else if(imc>=25.0 && imc<=29.9){
            System.out.println("Sobrepeso.");
        }else if(imc>=30.0 && imc<34.9){
            System.out.println("Obesidade Grau I.");
        }else if(imc>=35.0 && imc<=39.9){
            System.out.println("Obesidade Grau II.");
        }else if(imc>40){
            System.out.println("Obesidade Grau III.");
        }else{
            System.out.println("Valores invalidos.");
        }
    }
}