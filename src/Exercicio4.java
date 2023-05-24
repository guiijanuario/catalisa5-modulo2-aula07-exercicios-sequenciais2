import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#,##0.00");

        System.out.println("[----- Calcular o salário -----]");
        System.out.println("Digite quanto você ganha por hora trabalhada: (ex. 85,40)");
        double ganhoHora = entradaDoUsuario.nextDouble();
        System.out.println("Digite quantas horas você trabalhou este mês: (ex. 10,30)");
        double horasTrabalhada = entradaDoUsuario.nextDouble();
        double calculoSalario = ganhoHora * horasTrabalhada;
        System.out.println("Você vai receber este mês o salário de: " + "R$ " + formatador.format(calculoSalario));
    }
}
