import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("[----- Calcular média bimestral -----]");
        System.out.print("Digite a 1ª nota: ");
        double media1 = entradaDoUsuario.nextDouble();
        System.out.print("Digite a 2ª nota: ");
        double media2 = entradaDoUsuario.nextDouble();
        System.out.print("Digite a 3ª nota: ");
        double media3 = entradaDoUsuario.nextDouble();
        System.out.print("Digite a 4ª nota: ");
        double media4 = entradaDoUsuario.nextDouble();

        System.out.println("[------------- -******- -------------]");
        double calculoMedia = (media1 + media2 + media3 + media4) / 4;
        System.out.println("A média do aluno é: " + calculoMedia);
    }
}
