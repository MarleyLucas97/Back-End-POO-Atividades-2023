public class Rep01{
    public static void main(String[] args) {
        final int max=100;
        int l=-1;
        int k=-1;

        //for acredito que seja a melhor forma, pq e mais rapido e simples...
        for(int i=0;i<=max;i++){
            System.out.printf("%d - ",i);
        }

        System.out.println(" ");
        //o while tem que incrementar muitas coisas e muitos detalhes... exige mais atencao e tempo.
        while(l<max){
            l++;
            System.out.printf("%d / ",l);
        }

        System.out.println(" ");
        
        //O do while sofre do mesmo esquema do while.
        do{
            k++;
            System.out.printf("%d = ", k);
        }while(k<max);
    }
}