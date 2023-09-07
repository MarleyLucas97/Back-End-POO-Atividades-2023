import java.util.Scanner;

public class Rep08 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        final int max=20;
        int[] n = new int[max];
        int cal=0;

        for(int i=0;i<max;i++){
            System.out.printf("Digite o %d numero: %n",i+1);
            n[i]=leia.nextInt();
        }
        for(int i=0;i<max;i++){
            cal=n[i]*n[i];
            System.out.printf("O quadrado de %d e %d.%n",n[i], cal);
        }
    }
}
