## Power Classes

Os Wrappers são classes especiais que possuem métodos capazes de fazer conversões em variáveis primárias e também de encapsular tipos primitivos para serem trabalhados como objetos.
Existe uma classe Wrapper para cada tipo primitivo identificado pelo mesmo nome do tipo que possui e tendo a primeira letra maiúscula. Essa regra de declaração é aplicada a todos os tipos, exceto aos que são char classificados como Character.

De acordo com a hierarquia cada tipo wrapper numérico em Java são subclasses da superclasse abstrata Number (java.lang.Number) que consegue acessar todos os métodos values que são: doubleValue(), floatValue(), longValue(), intValue(), shortValue() e byteValue().

## Construtores

Nos construtores Wrappers apenas a classe Character não fornece dois construtores, sendo que as demais aceitam dois construtores.

Nos argumentos wrappers Boolean podem ser usados valores como: true, false e String. Um ponto de observação é que os valores declarados dentro do construtor não diferenciam letras maiúsculas de minúsculas.

## java.lang.Integer

A classe Integer envolve um valor do tipo primitivo int em um objeto. Um objeto do tipo Integer contém um único campo cujo tipo é int.
Além disso, esta classe fornece vários métodos para converter um int em uma String e uma String em um int, bem como outras constantes e métodos úteis ao lidar com um int.

## java.lang.Double

A classe double é uma classe wrapper para o tipo primitivo double que contém vários métodos , como convertê-lo em uma representação de string e vice-versa. Um objeto da classe Double pode conter um único valor double. Existem principalmente dois construtores para inicializar um objeto Double.

Link para o Slide: https://github.com/RayBMiranda/mjv-java-school/blob/main/power-classes/Power%20Classes.pptx

Exemplo de instanciação de alugumas classes Wrappers: https://github.com/RayBMiranda/mjv-java-school/blob/main/power-classes/src/ExemploClassesWrappers.java

Exemplo do java.lang.Integer: https://github.com/RayBMiranda/mjv-java-school/blob/main/power-classes/src/ExemploInteger.java

Exemplo do java.lang.Double: https://github.com/RayBMiranda/mjv-java-school/blob/main/power-classes/src/ExemploDouble.java

Link para o exemplo de utilização: https://github.com/RayBMiranda/mjv-java-school/tree/main/power-classes/src/ExUtilizacao

Fontes:
http://www.linhadecodigo.com.br/artigo/3667/classes-wrappers-em-java.aspx

https://acervolima.com/classe-java-lang-double-em-java/

https://imasters.com.br/back-end/wrappers

https://docs.oracle.com/javase/9/docs/api/java/lang/Double.html
