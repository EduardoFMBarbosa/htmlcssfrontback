import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int moto;
        int carro;

        System.out.println("Você vem pra faculdade de carro? (1 p/ sim e 2 p/ não).");
        carro = entrada.nextInt();

        System.out.println("Você vem pra faculdade de moto? (1 p/ sim e 2 p/ não).");
        moto = entrada.nextInt();

        if ((carro == 1 && moto == 2) || (carro == 2 && moto == 1)){
            System.out.println("Você não pega ônibus.");
        }
        else if (carro == 2 && moto == 2){
            System.out.println("Você pega ônibus.");
            else{
                System.out.println("Valores Invalidos");
            }
        }
    }
}
