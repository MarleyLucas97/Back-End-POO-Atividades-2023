import java.util.Scanner;
public class Exe10 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        int ddd=0;
        System.out.println("Digite o ddd: ");
        ddd=leia.nextInt();
        if(ddd==11){
            System.out.println("Sao Paulo");
        }else if(ddd==21){
            System.out.println("Rio de Janeiro");
        }else if(ddd==31){
            System.out.println("Belo Horizonte");
        }else if(ddd==41){
            System.out.println("Curitiba");
        }else{
            System.out.println("Uma cidade no Brasil");
        }
    }
}
