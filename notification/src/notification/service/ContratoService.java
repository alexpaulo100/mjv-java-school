package notification.service;

import notification.model.Contrato;

public class ContratoService {
    public String gerarConteudoContrato(Contrato contrato) {
        String texto = "";
        texto = texto + "Senhor: " + contrato.getCadastro().getPessoa().getNome();
        texto = texto + "Informamos que conforme contrato com protocolo de número " + contrato.getNumeroProtocolo();
        return texto;


    }

}
