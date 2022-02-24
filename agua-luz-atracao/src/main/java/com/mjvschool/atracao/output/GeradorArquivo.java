package com.mjvschool.atracao.output;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.mjvschool.atracao.model.contrato.Contrato;
import com.mjvschool.atracao.util.DataUtil;
import com.mjvschool.atracao.util.TextoUtil;

public class GeradorArquivo {
	public void gerarArquivoCsv(List<Contrato> contratos) {
		boolean windows = System.getProperty("os.name").toLowerCase().indexOf("win") >= 0;

		String fileSeparator = File.separator;

        StringBuilder conteudo = new StringBuilder();

        for (Contrato ct: contratos){
            conteudo.append(
                    ct.getCadastro().getPessoa().getCpf().concat(";")
                            .concat(ct.getCadastro().getPessoa().getNome().concat(";")
                                    .concat(ct.getCadastro().getPessoa().getCelular().concat(";"))
                                    .concat(ct.getCadastro().getPessoa().getEndereco().getLogradouro().concat(";"))
                                    .concat(ct.getCadastro().getPessoa().getEndereco().getComplemento().concat(";"))
                                    .concat(ct.getCadastro().getPessoa().getEndereco().getBairro().concat(";"))
                                    .concat(ct.getCadastro().getPessoa().getEndereco().getCidade().concat(";") + ct.getCadastro().getPessoa().getEndereco().getEstado().concat(";"))
                                    .concat(ct.getCadastro().getPessoa().getEndereco().getCep().concat(";"))
                                    .concat((""+ct.getNumeroProtocolo()).concat(";"))
                                    .concat(DataUtil.preparaData(ct.getDataHora()).concat(";"))
                                    .concat(DataUtil.preparaHora(ct.getDataHora()).concat(";"))
                                    .concat(String.valueOf(ct.getServico().getSigla()).concat(";"))
                                    .concat(TextoUtil.preencherSomenteNumeros(ct.getServico().getValor().toString(), 8, true).replace(" ", "0").concat(";"))
                            ));
            conteudo.append("\n");
        }
        System.out.println(conteudo.toString());

        String pastaAtual = System.getProperty("user.dir");
        String pasta = pastaAtual.substring(0,pastaAtual.lastIndexOf(fileSeparator));

        System.out.println("Diretório Destino: " + pasta);

        StringBuilder dirPath = new StringBuilder();
		if(!windows)
			dirPath.append(pasta.concat(fileSeparator).concat("agua-luz-output").concat(fileSeparator));
        else
			dirPath.append("C:\\estudo\\mjv-java-school\\agua-luz-output");

        File output = new File(dirPath.toString());
        if(!output.exists())
            output.mkdirs();

        Path path = Paths.get(dirPath.toString().concat(fileSeparator).concat("agua-luz-contratos.csv"));

        try {
            Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	public void gerarArquivoTxt(List<Contrato> contratos) {
		boolean windows = System.getProperty("os.name").toLowerCase().indexOf("win") >= 0;
		String fileSeparator = File.separator;
        StringBuilder conteudo = new StringBuilder();

        for (Contrato ct: contratos){
            conteudo.append(
                    TextoUtil.ajustarSomenteNumeros(ct.getCadastro().getPessoa().getCpf(), 11)
                            .concat(TextoUtil.ajustar(ct.getCadastro().getPessoa().getNome(), 30)
                                    .concat(TextoUtil.ajustarSomenteNumeros(ct.getCadastro().getPessoa().getCelular(),11))
                                    .concat(TextoUtil.ajustar(ct.getCadastro().getPessoa().getEndereco().getLogradouro(),20))
                                    .concat(TextoUtil.ajustar(ct.getCadastro().getPessoa().getEndereco().getComplemento(),10))
                                    .concat(TextoUtil.ajustar(ct.getCadastro().getPessoa().getEndereco().getBairro(), 15))
                                            .concat(TextoUtil.ajustar(ct.getCadastro().getPessoa().getEndereco().getCidade(),20) + TextoUtil.ajustar(ct.getCadastro().getPessoa().getEndereco().getEstado(),2))
                                            .concat(TextoUtil.ajustarSomenteNumeros(ct.getCadastro().getPessoa().getEndereco().getCep(),8))
                                            .concat(TextoUtil.ajustar(""+ct.getNumeroProtocolo(),10))
                                            .concat(DataUtil.preparaData(ct.getDataHora()))
                                            .concat(DataUtil.preparaHora(ct.getDataHora()))
                                            .concat(String.valueOf(ct.getServico().getSigla()))
                                            .concat(TextoUtil.preencherSomenteNumeros(ct.getServico().getValor().toString(), 8, true).replace(" ", "0"))
                    ));
            conteudo.append("\n");
        }

        String pastaAtual = System.getProperty("user.dir");
        String pasta = pastaAtual.substring(0,pastaAtual.lastIndexOf(fileSeparator));

        System.out.println("Diretório Destino: " + pasta);

        StringBuilder dirPath = new StringBuilder();
		if(!windows)
			dirPath.append(pasta.concat(fileSeparator).concat("agua-luz-output").concat(fileSeparator));
        else
			dirPath.append("C:\\estudo\\mjv-java-school\\agua-luz-output");


        File output = new File(dirPath.toString());
        if(!output.exists())
            output.mkdirs();

        Path path = Paths.get(dirPath.toString().concat(fileSeparator).concat("agua-luz-contratos.txt"));

        try {
            Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
