import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número para saber seu fatorial: ");
        int numero = leitura.nextInt();
        int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        if  (numero < 0) {
            System.out.println("Fatorial de " + numero + " não existe.");
        } else {
            System.out.println(resultado);
        }
    }
}
