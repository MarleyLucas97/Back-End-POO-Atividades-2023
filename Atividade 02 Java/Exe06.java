import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String senha="ASDFG", senhaUsuario="";

        System.out.println("Digite a senha: ");
        senhaUsuario=leia.nextLine();

        if(senhaUsuario.equals(senha)){
            System.out.println("Acesso garantido.");
        }else{
            System.out.println("Acesso negado.");
        }
    }
}
