package com.mjvschool.notificacao.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.mjvschool.notificacao.model.cadastro.Servico;
import com.mjvschool.notificacao.model.dto.DadosArquivoDTO;

public class ArquivoUtil {
    public static List<DadosArquivoDTO> lerArquivo(){
        List<DadosArquivoDTO> dados = new ArrayList<DadosArquivoDTO>();
        boolean windows = System.getProperty("os.name").toLowerCase().indexOf("win") >= 0;

		String fileSeparator = File.separator;

        String pastaAtual = System.getProperty("user.dir");
        String pasta = pastaAtual.substring(0,pastaAtual.lastIndexOf(fileSeparator));

        System.out.println("Diretório Destino: " + pasta);

        StringBuilder dirPath = new StringBuilder();
		if(!windows)
			dirPath.append(pasta.concat(fileSeparator).concat("agua-luz-output").concat(fileSeparator));
        else
			dirPath.append("C:\\estudo\\mjv-java-school\\agua-luz-output");

        File input = new File(dirPath.toString());
        if(!input.exists())
            return null;

        Path path = Paths.get(dirPath.toString().concat(fileSeparator).concat("agua-luz-contratos.txt"));

        List<String> linhas = null;
        try {
            linhas = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }        

        for (String linha : linhas) {
            System.out.println(linha);
            int posAtual = 0;
            String cpf = linha.substring(posAtual, posAtual+11).trim();
            posAtual = 11;
            String nome = linha.substring(posAtual, posAtual+30).trim();
            posAtual += 30;
            String celular = linha.substring(posAtual, posAtual+11).trim();
            posAtual += 11;
            String logradouro = linha.substring(posAtual, posAtual+20).trim();
            posAtual += 20;
            String complemento = linha.substring(posAtual, posAtual+10).trim();
            posAtual += 10;
            String bairro = linha.substring(posAtual, posAtual+15).trim();
            posAtual += 15;
            String cidade = linha.substring(posAtual, posAtual+20).trim();
            posAtual += 20;
            String estado = linha.substring(posAtual, posAtual+2).trim();
            posAtual += 2;
            String cep = linha.substring(posAtual, posAtual+8).trim();
            posAtual += 8;
            String protocolo = linha.substring(posAtual, posAtual+10).trim();
            posAtual += 10;
            String data = linha.substring(posAtual, posAtual+8).trim();
            posAtual += 8;
            String hora = linha.substring(posAtual, posAtual+4).trim();
            posAtual += 4;
            String tipoInstalacao = linha.substring(posAtual, posAtual+1).trim();
            posAtual += 1;
            String valor = linha.substring(posAtual, posAtual+8).trim();
            posAtual += 8;

            DadosArquivoDTO dadosArquivoDTO = new DadosArquivoDTO();

            dadosArquivoDTO.setCpf(cpf);
            dadosArquivoDTO.setNome(nome);
            dadosArquivoDTO.setEstado(estado);
            dadosArquivoDTO.setLogradouro(logradouro);
            dadosArquivoDTO.setCidade(cidade);
            dadosArquivoDTO.setBairro(bairro);
            dadosArquivoDTO.setCep(cep);
            dadosArquivoDTO.setCelular(celular);
            dadosArquivoDTO.setComplemento(complemento);
            dadosArquivoDTO.setData(DataUtil.preparaData(data + " " + hora));
            dadosArquivoDTO.setProtocolo(protocolo);
            dadosArquivoDTO.setTipoInstalacao(tipoInstalacao == "L" ? Servico.LUZ : Servico.AGUA);
            dadosArquivoDTO.setValor(NumeroUtil.preparaDouble(valor));
            
            dados.add(dadosArquivoDTO);
        }

        return dados;
    }
}
