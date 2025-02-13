import java.util.ArrayList;
import java.util.List;

public class GerenciadorFuncionarios {
    private List<Funcionario> funcionarios;

    public GerenciadorFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    // Adicionar funcionário
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado com sucesso!");
    }

    // Listar funcionários
    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario f : funcionarios) {
                System.out.println(f);
            }
        }
    }

    // Atualizar salário pelo ID
    public void atualizarSalario(int id, double novoSalario) {
        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                f.setSalario(novoSalario);
                System.out.println("Salário atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Funcionário com ID " + id + " não encontrado.");
    }

    // Remover funcionário pelo ID
    public void removerFuncionario(int id) {
        funcionarios.removeIf(f -> f.getId() == id);
        System.out.println("Funcionário removido com sucesso!");
    }
}
