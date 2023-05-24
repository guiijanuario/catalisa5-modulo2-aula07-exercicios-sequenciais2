import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");

        System.out.println("[----- Transformar a temperatura de Fahrenheit em Celsius -----]");
        System.out.print("Insira o Fahrenheit: ");
        int fahrenheit = entradaDoUsuario.nextInt();
        double celsius =  (fahrenheit - 32) / 1.8;
        System.out.println("O Fahrenheit de " + fahrenheit + "F° em Celsius é " + formatador.format(celsius) + "C°");


    }
}
