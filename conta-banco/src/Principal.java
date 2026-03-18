import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número da sua conta bancária:");
        int numeroConta = entrada.nextInt();

         entrada.nextLine();

        System.out.println("Informe o número da sua agencia:");
        String agencia = entrada.nextLine();
       

        System.out.println("Informe o Seu nome completo:");
        String nomeCliente = entrada.nextLine();

        ContaTerminal conta = new ContaTerminal(numeroConta, agencia, nomeCliente);
        System.out.println(conta.toString());

    }
}
