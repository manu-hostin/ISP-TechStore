package ISP_Solucao;

public interface ICadastroCliente {

    void cadastrarCliente(String nome, String email);

    String buscarClientePorEmail(String email);
}
