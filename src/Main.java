import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorFuncionarios gerenciador = new GerenciadorFuncionarios();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Gerenciador de Funcionários ===");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Atualizar Salário");
            System.out.println("4. Remover Funcionário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o salário: ");
                    double salario = scanner.nextDouble();
                    gerenciador.adicionarFuncionario(new Funcionario(id, nome, salario));
                    break;
                case 2:
                    gerenciador.listarFuncionarios();
                    break;
                case 3:
                    System.out.print("Digite o ID do funcionário: ");
                    int idAtualizar = scanner.nextInt();
                    System.out.print("Digite o novo salário: ");
                    double novoSalario = scanner.nextDouble();
                    gerenciador.atualizarSalario(idAtualizar, novoSalario);
                    break;
                case 4:
                    System.out.print("Digite o ID do funcionário a ser removido: ");
                    int idRemover = scanner.nextInt();
                    gerenciador.removerFuncionario(idRemover);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
