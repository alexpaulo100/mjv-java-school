package notification.app;

import notification.model.*;
import notification.service.ContratoService;
import notification.service.TransmissorMensagem;
import notification.service.TransmissorMensagemSms;
import notification.service.TransmissorMensagemWhats;

import java.util.Date;

public class NotificationSystem {
    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setNumeroProtocolo(123);
        Cadastro cadastro = new Cadastro();
        cadastro.setAtivo(true);
        cadastro.setNumero(27);
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("17585564595");
        pessoa.setNome("Manoel dos Santos ");
        pessoa.setRg("268789526");
        pessoa.setTelefone("999781538");
        Endereco endereco = new Endereco();
        endereco.setBairro("República");
        endereco.setCep("01035-000");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setLogradouro("Avenida Ipiranga");
        cadastro.setPessoa(pessoa);
        cadastro.setNotificacaoTipo(NotificacaoTipo.WHATS);
        contrato.setCadastro(cadastro);
        contrato.setDataHora(new Date());

        ContratoService service = new ContratoService();
        String mensagem = service.gerarConteudoContrato(contrato);

        TransmissorMensagem transmissor = null;
        if (cadastro.getNotificacaoTipo() == NotificacaoTipo.SMS)
            transmissor = new TransmissorMensagemSms();
        else
            transmissor = new TransmissorMensagemWhats();
        transmissor.transmitir(contrato.getCadastro().getPessoa().getTelefone(), mensagem);


        System.out.println(service.gerarConteudoContrato(contrato));

    }
}
