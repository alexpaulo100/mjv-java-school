package notification.model;

import java.util.Date;

public class Contrato {
    private long numeroProtocolo;
    private Cadastro cadastro;
    private Date dataHora;

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public long getNumeroProtocolo() {
        return numeroProtocolo;
    }

    public void setNumeroProtocolo(long numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
}
