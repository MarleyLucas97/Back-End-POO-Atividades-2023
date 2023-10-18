import java.util.Scanner;

public class At05 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);

        int n1, n2, res, res2;
        
        System.out.println("Digite o numero para elevar a potencia 2: ");
        n1=leia.nextInt();
        
        
        System.out.println("Digite o numero para elevar a potencia 3: ");
        n2=leia.nextInt();

        res=n1*n1;
        res2=n2*n2*n2;

        System.out.printf("%n%d elevado a 2 e: %d, e %d elevadoa 3 e: %d%n",n1, res, n2, res2);
    }
}
