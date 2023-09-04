import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int n1=0;

        System.out.println("Digite um valor: ");
        n1=leia.nextInt();

        if(n1>0){
            System.out.println("E positivo.");
        }else if(n1<0){
            System.out.println("E negativo.");
        }else{
            System.out.println("E zero.");
        }
    }
}
