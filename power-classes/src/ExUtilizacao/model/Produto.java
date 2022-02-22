package model;

public class Produto {
    private Integer id;
    private String codigoBarras;
    private String descricao;
    private Double precoCusto;
    private Double precoVenda;
    private boolean ativo;

    public Integer getId() {
        return id;
    }
    
    public String getCodigoBarras() {
        return codigoBarras;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public Double getPrecoCusto() {
        return precoCusto;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Id = ")
        .append(id.toString())
        .append("\nCódigo Barras = ")
        .append(codigoBarras)
        .append("\nDescrição = ")
        .append(descricao)
        .append("\nPreço Custo = ")
        .append(precoCusto)
        .append("\nPreço Venda = ")
        .append(precoVenda)
        .append("\nAtivo = ")
        .append(ativo);

        return retorno.toString();
    }

}
