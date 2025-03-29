import java.util.Scanner;

public class ProjetoFinal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        String tipoDeConta = "Corrente";
        int valorInicial = 2500;
        int saldoAtual = valorInicial;

        System.out.print("Digite seu nome: ");
        nome = leitor.next();

        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Seu saldo atual é de: R$ " + saldoAtual);

        while (true) {
            System.out.println("Operações ");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir Saldo");
            System.out.println("4 - Sair");

            System.out.print("Digite o valor desejado: ");
            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é de: R$ " + saldoAtual);
                    break;
                case 2:
                    System.out.print("Qual seria o valor para receber? ");
                    int valorRecebido = leitor.nextInt();
                    saldoAtual += valorRecebido;
                    System.out.println("Saldo atual = R$ " + saldoAtual);
                    break;
                case 3:
                    System.out.print("Digite o valor que deseja transferir: ");
                    int valorEnviado = leitor.nextInt();
                    saldoAtual -= valorEnviado;
                    System.out.println("Seu Saldo atual é de: R$ " + saldoAtual);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
