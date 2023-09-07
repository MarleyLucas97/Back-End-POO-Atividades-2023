import java.util.Random;

public class Rep06 {
    public static void main(String[] args) {

        Random gerador= new Random();
        final int max=50;
        int[] n = new int[max];
        int i=0;
        int cal=0;

        while(i<49){
            i++;
            n[i]=gerador.nextInt();
            
        }

        for(int j=0;j<max;j++){
        System.out.printf("%d + ",n[j]);
        }

        for(int k=0;k<max;k++){
            cal+=n[k];
        }
        System.out.printf("%n O resultado da soma foi de: %d.", cal);
    }
}
