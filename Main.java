import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double v1;
        double v2;
        double soma;
        double diferenca;
        double produto;
        double divisao;
        double potencia;
        double resto;


        System.out.println("Digite um valor");
        v1 = entrada.nextInt();

        System.out.println("Digite outro valor");
        v2 = entrada.nextInt();

        soma = v1 + v2;
        diferenca = v1 - v2;
        produto = v1 * v2;
        divisao = v1 / v2;
        potencia = Math.pow(v1, v2);
        resto = v1 % v2;

        System.out.println("A SOMA é "+soma+" e a DIFERENÇA é "+diferenca);
        System.out.println("O PRODUTO é "+produto+" e a DIVISÃO é "+divisao);
        System.out.println("A POTENCIALIZAÇÃO é "+potencia+" e o RESTO é "+resto);



    }
}