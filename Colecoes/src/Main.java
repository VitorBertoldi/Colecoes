import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();
        int resp = 2;


        while (resp != 1) {
            System.out.println("Digite seu nome: ");
            String nome = sc.next();

            System.out.println("Qual é o seu sexo ? M -> Masculino F -> Feminino ");
            String sexo = sc.next();

            if (sexo.equals("M")) {
                masculino.add(nome);
            } else {
                feminino.add(nome);
            }
            System.out.println("Deseja continuar ? 1 --> nao 2 --> sim");
            resp = sc.nextInt();
        }
        System.out.println("Nomes inseridos com sucesso, programa finalizado!");
    }
}