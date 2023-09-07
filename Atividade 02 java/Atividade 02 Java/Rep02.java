import java.util.Scanner;

public class Rep02 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);

        final int maxNumero=5;
        final int max=5;
        int[] numero=new int[maxNumero];
        int cal=0, cal2=0;
        for(int i=0; i<max; i++){
            System.out.println("Digite um numero: ");
            numero[i]=leia.nextInt();
        }

        cal=numero[0]+numero[1]+numero[2]+numero[3]+numero[4];
        cal2=cal/2;
        System.out.printf("O resultado e %d.",cal2);
    }   
}
