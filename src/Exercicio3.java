import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0");

        System.out.println("[----- Converter metros em centímetros -----]");
        System.out.print("Digite quantos metros você quer converter: ");
        double metros = entradaDoUsuario.nextDouble();
        double conversaoCentimetros = metros*100;
        System.out.print("Você digitou: " + formatador.format(metros) + " metros," + " que é: " + formatador.format(conversaoCentimetros) + " centímetros.");
    }
}
