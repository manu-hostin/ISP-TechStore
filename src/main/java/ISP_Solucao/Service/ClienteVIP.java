package ISP_Solucao.Service;

import ISP_Solucao.ICadastroCliente;
import ISP_Solucao.IGerenciadorFidelidade;
import ISP_Solucao.INotificacao;

public class ClienteVIP implements ICadastroCliente, INotificacao, IGerenciadorFidelidade {

    @Override
    public void cadastrarCliente(String nome, String email) {
        System.out.println("Cliente VIP: Cadastrando cliente " + nome);
    }

    @Override
    public String buscarClientePorEmail(String email) {
        return "Cliente VIP: Encontrado cliente com email " + email;
    }

    @Override
    public void enviarNotificacao(String email, String mensagem) {
        System.out.println("Cliente VIP: Enviando notificação para " + email);
    }

    @Override
    public void aplicarDescontoVIP(String email, double percentual) {
        System.out.println("Cliente VIP: Aplicando " + percentual + "% de desconto para " + email);
    }
}
