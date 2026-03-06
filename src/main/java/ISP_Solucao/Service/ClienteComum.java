package ISP_Solucao.Service;

import ISP_Solucao.ICadastroCliente;

public class ClienteComum implements ICadastroCliente {

    @Override
    public void cadastrarCliente(String nome, String email) {
        System.out.println("Cliente COMUM: Cadastrando " + nome);
    }

    @Override
    public String buscarClientePorEmail(String email) {
        return "Cliente COMUM: Encontrado cliente com email " + email;
    }

}
