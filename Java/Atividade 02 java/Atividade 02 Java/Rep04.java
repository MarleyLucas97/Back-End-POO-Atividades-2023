public class Rep04 {
    public static void main(String[] args) {
        
        final int max=10;
        int cal=0,cal2=0;

        do{
            cal+=1;
            cal2=cal+cal;
        }while(cal<max);
        
        System.out.printf("%d   ",cal2);
    }
}
