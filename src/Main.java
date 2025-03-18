import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        int numeroAdivinhado;
        int numeroSecreto;
        int tentativas = 1;
        int minimo = 1;
        int maximo = 100;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        numeroSecreto = random.nextInt(minimo, maximo + 1);

        System.out.println("Bem vindo ao Jogo do Número Secreto!");
        System.out.printf("Adivinhe um Número de %d-%d: ", minimo, maximo);
        numeroAdivinhado = scanner.nextInt();

        while(numeroAdivinhado != numeroSecreto){
            tentativas++;
            if(numeroAdivinhado > numeroSecreto){
                System.out.println("O Número Secreto é menor! Tente novamente.");
                System.out.printf("Adivinhe um Número de %d-%d: ", minimo, maximo);
                numeroAdivinhado = scanner.nextInt();
            } else if(numeroAdivinhado < numeroSecreto){
                System.out.println("O Número Secreto é maior! Tente novamente.");
                System.out.printf("Adivinhe um Número de %d-%d: ", minimo, maximo);
                numeroAdivinhado = scanner.nextInt();
            }
        }

        System.out.println("Parabéns voce descobriu o Número Secreto com " + tentativas + " tentativas!");

        scanner.close();
    }
}
