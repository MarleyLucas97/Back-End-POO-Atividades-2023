import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        
        Scanner leia=new Scanner(System.in);

        char sexo;

        System.out.printf("Escolha o sexo: %nf   ou   m%n");
        sexo=leia.nextLine().charAt(0);

        if(sexo=='f'){
            System.out.println("Feminino.");
        }else if(sexo=='m'){
            System.out.println("Masculino.");
        }else{
            System.out.println("Sexo invalido.");
        }
    }
}
