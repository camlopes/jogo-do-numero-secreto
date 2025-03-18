import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        int numeroAdivinhado;
        int numeroSecreto;
        int tentativas = 1;

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        numeroSecreto = random.nextInt(1 , 101);

        System.out.println("Bem vindo ao Jogo do Número Secreto!");
        System.out.print("Adivinhe um Número de 1-100: ");
        numeroAdivinhado = scanner.nextInt();

        while(numeroAdivinhado != numeroSecreto){
            tentativas++;
            if(numeroAdivinhado > numeroSecreto){
                System.out.println("O Número Secreto é menor! Tente novamente.");
                System.out.print("Adivinhe um Número de 1-100: ");
                numeroAdivinhado = scanner.nextInt();
            } else if(numeroAdivinhado < numeroSecreto){
                System.out.println("O Número Secreto é maior! Tente novamente.");
                System.out.print("Adivinhe um Número de 1-100: ");
                numeroAdivinhado = scanner.nextInt();
            }
        }

        System.out.println("Parabéns voce descobriu o Número Secreto com " + tentativas + " tentativas!");

        scanner.close();
    }
}
