import java.util.Scanner;

public class P1{
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int dia=0, mes=0, ano=0, cal=0, cal2=0, cal3=0, mec=0;

        System.out.println("Digite o dia do seu nascimento: ");
        dia=leia.nextInt();

        System.out.println("Digite o mes do seu nascimento: ");
        mes=leia.nextInt();

        System.out.println("Digite o ano do seu nascimento: ");
        ano=leia.nextInt();

        cal=2023-ano;
        cal2=mes*30;
        cal3=dia;
        mec=(cal*365)+cal2+cal3;

        System.out.printf("Sua idade em dias e de aproximadamente: %d.", mec);
    }
}