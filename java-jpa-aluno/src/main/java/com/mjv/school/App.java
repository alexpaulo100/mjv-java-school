package com.mjv.school;

import com.mjv.school.model.Aluno;
import com.mjv.school.repository.AlunoJpaRepository;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AlunoJpaRepository alunoJpaRepository = new AlunoJpaRepository();
        List<Aluno> alunoList = alunoJpaRepository.findAll();
        System.out.println(alunoList.get(0).getNome());

        System.out.println( "Hello World!" );
    }
}
