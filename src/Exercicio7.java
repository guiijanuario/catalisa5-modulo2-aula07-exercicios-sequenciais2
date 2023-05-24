import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#,##0.00");

        System.out.println("[----- Folha de pagamento -----]");
        System.out.println("Digite quanto você ganha por hora trabalhada: (ex. 85,40)");
        double ganhoHora = entradaDoUsuario.nextDouble();
        System.out.println("Digite quantas horas você trabalhou este mês: (ex. 10,30)");
        double horasTrabalhada = entradaDoUsuario.nextDouble();
        double calculoSalario = ganhoHora * horasTrabalhada;
        System.out.println("O seu salário bruto é " + "R$ " + formatador.format(calculoSalario));

        double calculoINSS = (calculoSalario * 11) / 100;
        System.out.println("O que você vai pagar de INSS " + "R$ " + formatador.format(calculoINSS));

        double calculoImposto = (calculoSalario * 8) / 100;
        System.out.println("O que você vai pagar de Imposto " + "R$ " + formatador.format(calculoImposto));

        double calculoSindicato = (calculoSalario * 5) / 100;
        System.out.println("O que você vai pagar de Sindicato " + "R$ " + formatador.format(calculoSindicato));

        double calculoSalarioLiquido = calculoSalario - calculoINSS - calculoImposto - calculoSindicato;
        System.out.println("Seu salário liquido é " + "R$ " + formatador.format(calculoSalarioLiquido));

        double calculoSalarioLiquidoDif = calculoSalarioLiquido - calculoSalario;
        System.out.println("Foi descontado do seu salário o total de " + "R$ " + formatador.format(calculoSalarioLiquidoDif));

    }
}
