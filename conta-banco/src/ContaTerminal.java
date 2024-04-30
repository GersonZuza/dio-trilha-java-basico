import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagens para o nosso usuario
        System.out.println("Digite sua Agencia");
        // Obter pela scanner os valores digitados no terminal
        String agencia = scanner.next();

        System.out.println("Digite sua Conta");
        // Obter pela scanner os valores digitados no terminal
        int conta = scanner.nextInt();

        System.out.println("Digite o Nome do Cliente");
        // Obter pela scanner os valores digitados no terminal
        String nome = scanner.next();

        System.out.println("Digite o Sobrenome Cliente");
        // Obter pela scanner os valores digitados no terminal
        String sobrenome = scanner.next();

        System.out.println("Digite o seu Saldo");
        // Obter pela scanner os valores digitados no terminal
        double saldo = scanner.nextDouble();

        // Exibir a mensagem conta criada
        System.out.println("Olá, " + nome + " " + sobrenome + "Obrigado por criar uma conta em nosso banco");

        System.out.println("Sua agencia é: " + agencia);
        System.out.println("Sua conta é: " + conta);
        System.out.println("Seu saldo é: " + saldo + "e seu saldo já esta disponível para saque");
    }
}
