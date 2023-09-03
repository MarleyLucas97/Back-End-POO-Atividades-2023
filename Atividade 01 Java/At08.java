import java.util.Scanner;
public class At08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1,n2,cal,cal2,cal3,cal4,cal5;

        System.out.println("Digite o primeiro numero: ");
        n1=leia.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2=leia.nextInt();

        cal=n1+n2;
        cal2=n1*(n2*n2);
        cal3=(n1*n1)/(n2*n2);
        cal4=(n1*n1)+(n2*n2);
        cal5=n1/(n2*n2);

        System.out.printf("%d, %d, %d, %d, %d",cal, cal2, cal3, cal4, cal5);
    }
}
