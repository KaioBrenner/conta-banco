import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nome_cliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
