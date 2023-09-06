import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);

        int idade=0;

        System.out.println("Digite a idade: ");
        idade=leia.nextInt();
        if(idade>=5 && idade<=7){
            System.out.println("Infantil A");
        }else if(idade>=8 && idade<=10){
            System.out.println("Infantil B");
        }else if(idade>=11 && idade<=13){
            System.out.println("Juvenil A");
        }else if(idade>=14 && idade<=17){
            System.out.println("Juvenil B");
        }else if(idade>=18){
            System.out.println("Adulto");
        }else{
            System.out.println("Erro.");
        }
    }
}
