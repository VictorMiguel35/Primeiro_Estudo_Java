import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int tentativas;
        int chute;
        int numeroAleatorio = new Random().nextInt(100);
        System.out.println(numeroAleatorio);

        for (tentativas = 0; tentativas < 5; tentativas++) {
            System.out.println("Digite um número: ");
            chute = leitura.nextInt();
            if (chute > numeroAleatorio) {
                System.out.println("O número secreto é menor");
            } else if (chute < numeroAleatorio) {
                System.out.println("O número secreto é maior");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto.");
                break;
            }
        }
        if (tentativas == 5) {
            System.out.println("Que pena!Você esgotou o número de tentativas.");
        }
    }
}
