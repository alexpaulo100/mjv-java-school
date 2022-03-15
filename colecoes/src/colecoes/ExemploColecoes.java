package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploColecoes {
    public static void main(String[] args) {
        //exemploList();
        exemploListObject();
    }

    static void exemploListObject(){
        List<Aluno> alunos = new ArrayList();
        alunos.add(new Aluno("ray"));
        alunos.add(new Aluno("athos")); //generics
        alunos.add(new Aluno("marcelle"));
        alunos.add(new Aluno("viviane"));
        
        Collections.sort(alunos);

        System.out.println(alunos.get(2));

        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }

    static void exemploList() {
        List<String> alunos = new ArrayList();
        alunos.add("ray");
        alunos.add("athos"); //generics
        alunos.add("marcelle");
        alunos.add("viviane");
        
        System.out.println(alunos.size());
        Collections.sort(alunos);
        for(String aluno : alunos){
            System.out.println(aluno);
        }
        
    }
}
