import java.util.Scanner;

public class At12 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double a=0, b=0, c=0, x=0, x2=0;

        System.out.println("Valor de a: ");
        a=leia.nextDouble();

        System.out.println("Valor de b: ");
        b=leia.nextDouble();

        System.out.println("Valor de c: ");
        c=leia.nextDouble();

        x=((b*-1)+((b*b)-4*a*c)/((b*b)-4*a*c))/a*2;
        x2=((b*-1)-((b*b)-4*a*c)/((b*b)-4*a*c))/a*2;

        System.out.printf("x' e igual a: %f%nx'' e igual a: %f", x, x2);
    }
}
