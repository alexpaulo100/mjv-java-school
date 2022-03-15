package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {

        Set<String> integrantesGrupo2 = new HashSet<String>();
        integrantesGrupo2.add("Ray");
        integrantesGrupo2.add("Alex");
        integrantesGrupo2.add("Natalia");
        integrantesGrupo2.add("Gisele");
        integrantesGrupo2.add("Erick");
        integrantesGrupo2.add("Fabricio");
        integrantesGrupo2.add("Nadine");

        //dados duplicados não são inseridos no Set
        integrantesGrupo2.add("Erick");
        integrantesGrupo2.add("Fabricio");
        integrantesGrupo2.add("Nadine");
 
        System.out.println("Tamanho coleção Set: "+integrantesGrupo2.size());
        int count = 0;
        for(String valor : integrantesGrupo2){
            System.out.println(++count + " -> " + valor);
        }

        Set<String> ord = new TreeSet<String>(integrantesGrupo2);

        System.out.println("Sem ordenação: " + integrantesGrupo2);
        System.out.println("Com ordenação: " + ord);
    }
    
}
