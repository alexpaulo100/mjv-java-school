import model.Produto;

public class ExemploUtilizacao {
    public static void main(String[] args) {
    
        //Simulação de Leitura de Um Arquivo
        String[] arquivo = {"1", "7891234678911", "Apostila Java", "15.15", "25.55", "true"};

        Produto produto = new Produto();
        
        produto.setId(Integer.parseInt(arquivo[0]));

        produto.setCodigoBarras(arquivo[1]);

        produto.setDescricao(arquivo[2]);

        produto.setPrecoCusto(Double.parseDouble(arquivo[3]));

        produto.setPrecoVenda(Double.parseDouble(arquivo[4]));

        produto.setAtivo(Boolean.parseBoolean(arquivo[5]));

        System.out.println(produto.toString());

        Boolean precoCustoIgualVenda = produto.getPrecoCusto().equals(produto.getPrecoVenda());

        System.out.println(
            "Preço de Custo igual ao Preço de Venda: " + (precoCustoIgualVenda));
    }
}
