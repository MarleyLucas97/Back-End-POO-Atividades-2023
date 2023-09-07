import java.util.Scanner;

public class Rep05 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        final int max=10;
        int[] n = new int[10];
        int cal=0; 

        for(int i=0;i<max;i++){
            System.out.printf("Digite o %d numero: %n",i+1);
            n[i]=leia.nextInt();
        }
        for(int i=0;i<max;i++){
            cal+=n[i];
        }
        System.out.printf("O resultado e %d.",cal);
    }
}
