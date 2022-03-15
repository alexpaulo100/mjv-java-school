package com.mjv.school.app;

import java.util.ArrayList;
import java.util.List;

import com.mjv.school.model.Aluno;
import com.mjv.school.repository.AlunoRepository;
import com.mjv.school.util.FabricaConexao;

public class App 
{
    public static void main( String[] args )
    {
        Aluno aluno = new Aluno();
        /*aluno.setNome("Aluno Novo");
        aluno.setAltura(2.65);
        aluno.setSexo("M");
        aluno.setAtivo(true);*/

        AlunoRepository alunoRepository = new AlunoRepository();
        //alunoRepository.gravar(aluno);
        /*aluno = alunoRepository.getAluno(3);
        aluno.setNome("Aluno Alterado");
        aluno.setAltura(2.00);
        alunoRepository.gravar(aluno);*/

        /*Aluno aluno2 = alunoRepository.getAluno(1);
        System.out.println(aluno2.getNome());*/

        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos = alunoRepository.listarAlunos();

        for (Aluno aluno3 : alunos) {
            System.out.println(aluno3.getId() + " - " + aluno3.getNome());
        }

       /* Aluno alunoAlterado = alunos.get(1);
        alunoAlterado.setNome("Teste");

        alunoRepository.gravar(alunoAlterado);

        alunoAlterado = alunoRepository.getAluno(alunoAlterado.getId());
        System.out.println(alunoAlterado.getId() + " - " + alunoAlterado.getNome());
        */

        FabricaConexao.fecharConexao();
    }
}
