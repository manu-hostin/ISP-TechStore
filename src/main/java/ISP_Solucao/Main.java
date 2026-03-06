package ISP_Solucao;

import ISP_Solucao.Service.ClienteComum;
import ISP_Solucao.Service.ClienteVIP;

public class Main {
    public static void main(String[] args) {

        ClienteComum clienteComum = new ClienteComum();
        clienteComum.cadastrarCliente("Lucas", "lucas@email.com");
        System.out.println(clienteComum.buscarClientePorEmail("lucas@email.com"));

        System.out.println();

        ClienteVIP clienteVIP = new ClienteVIP();
        clienteVIP.cadastrarCliente("Manu", "manu@email.com");
        System.out.println(clienteVIP.buscarClientePorEmail("manu@email.com"));
        clienteVIP.enviarNotificacao("manu@email.com", "Promoção especial!");
        clienteVIP.aplicarDescontoVIP("manu@email.com", 20);

    }
}