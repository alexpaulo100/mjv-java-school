import java.util.Date;

public class ExempOperadores {
    public static void main(String[] args) {
        System.out.println("Exemplo de Operadores:");

        //Atribuicao
        String nome = "Joao";
        nome = "Silva";
        int idade = 45;
        double peso = 82.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        //Aritimeticos
        double soma = 12.5 + 15.7;
        int subtracao = 115 - 25;
        int multiplicacao = 50*9;
        int divisao = 20/5;
        double resultado = (50 * 5) + (40/8);

        String concatenacao ="?";

        concatenacao = 1+1+1+"1";

        concatenacao = 1+"1"+1+1;

        concatenacao = 1+"1"+1+"1";

        concatenacao = "1"+1+1+1;

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        //Unarios
        //classe Operadores.java
        int numero = 5;

        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1
        System.out.println(numero ++);

        System.out.println(numero);

        //ordem de precedencia
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

        //Ternario

        int a, b;

        a = 5;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado2 = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado2);

        //classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        String nome1 = "JAVA";
        String nome2 = "JAVA";

        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
        String nome7 = new String("JAVA");

        System.out.println(nome3 == nome7); //false

        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true

        //equals na parada
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??

        // Operadores.java
        boolean condicao1=true;

        boolean condicao2=false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas
        expressões.
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");;

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");

        // ComparacaoAvancada.java
        int n1 = 1;
        int n2 = 1;

        if(n1== 2 & n2 ++ == 2 )
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O numero 1 agora é " + n1);
        System.out.println("O numero 2 agora é " + n2);

        if(false) System.out.println("a"); System.out.println("B");

        //Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )
    }

}
