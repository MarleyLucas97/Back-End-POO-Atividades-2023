public class At09 {
    public static void main(String[] args) {
        
    double item=100, item2=125, cal=0, taxaCalculada=0, novoCusto=0;

    System.out.println("O Item 1 custa R$100,00");
    System.out.println("O Item 2 custa R$125,00");

    cal=item+item2;
    System.out.printf("O valor total e de: %f%n", cal);
    
    taxaCalculada=cal*0.1;
    System.out.printf("O valor com acrescimo de 10 por cento e de: %f%n", taxaCalculada);
    
    novoCusto=(item*1.1)+(item2*1.1);
    System.out.printf("O valor do novo custo e de: %f", novoCusto);
    
    }
}
