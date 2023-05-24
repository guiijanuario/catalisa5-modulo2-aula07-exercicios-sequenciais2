import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("[----- Imprimir o antecessor e o sucessor do número inserido -----]");
        System.out.print("Insira o número: ");
        int numero = entradaDoUsuario.nextInt();
        int numeroAntecessor = numero - 1;
        int numeroSucessor = numero + 1;
        System.out.print("O sucessor do número " + numero + " é " + numeroSucessor + " e o antecessor é " + numeroAntecessor);

    }
}
