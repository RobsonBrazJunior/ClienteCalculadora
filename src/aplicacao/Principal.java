package aplicacao;

import clientews.ServicoCalculadora;
import clientews.ServicoCalculadora_Service;

public class Principal {

    public static void main(String[] args) {
        ServicoCalculadora_Service service = new ServicoCalculadora_Service();
        ServicoCalculadora port = service.getServicoCalculadoraPort();
        System.out.println("Soma = " + port.somar(20, 30));
    }    
}
