
public class ExemploClassesWrappers {
    public static void main(String[] args) {
        String numInt = "9822";
         
        //Representação em String do tipo que está sendo criado
        Float fNum1 = new Float("500.50");
        fNum1 = Float.parseFloat("500.50");

        Integer iNum1 = new Integer(numInt);
        Double dNum1 = new Double("512.22");
         
        //o argumento somente aceita do tipo char, por isso que é usado aspas simples
        Character cNum = new Character('a');
         
        //Criação do tipo primitivo natural
        Float fNum2 = new Float(500.50);
        fNum2 = 500.50f;

        Integer iNum2 = new Integer(2800);
        Double dNum2 = new Double(512.22);
         
        System.out.println("Float representadopor string: "+fNum1);
        System.out.println("Float natural: "+fNum2);
        System.out.println("Integer representado por string: "+iNum1);
        System.out.println("Char: "+cNum);

        boolean flag1 = true;
        boolean flag2 = false;
        String flag3 = "true";
         
        //Boolean b1 = new Boolean("truE");
        Boolean b1 = new Boolean("truE");
        //Boolean b2 = new Boolean("TRUE");
        Boolean b2 = new Boolean("TRUE");
        //Boolean b3 = new Boolean("TuE");
        Boolean b3 = new Boolean("TuE");
        //Boolean b4 = new Boolean(flag3);
        Boolean b4 = new Boolean(true);

 
        if(b1){
                System.out.println("B1 é verdadeiro!");
        }
         
        if(flag1 == b2){
                System.out.println("flag1 == b2: Igual");
        }else{
                System.out.println("flag1 == b2: Diferente");
        }
 
        System.out.println(flag1 == b1 ? "flag1 == b1: Igual" : "flag1 == b1: Diferente");
        System.out.println(flag1 == b3 ? "flag1 == b3: Igual" : "flag1 == b3: Diferente");
        System.out.println(flag1 == b4 ? "flag1 == b4: Igual" : "flag1 == b4: Diferente");
         
        Boolean b5 = new Boolean("false");
        Boolean b6 = new Boolean("faLse");
        Boolean b7 = new Boolean("FALSE");
        Boolean b8 = new Boolean("flse");
         
        System.out.println(flag2 == b5 ? "flag2 == b5: Igual" : "flag2 == b5: Diferente");
        System.out.println(flag2 == b6 ? "flag2 == b6: Igual" : "flag2 == b6: Diferente");
        System.out.println(flag2 == b7 ? "flag2 == b7: Igual" : "flag2 == b7: Diferente");
        System.out.println(flag2 == b8 ? "flag2 == b8: Diferente" : "flag2 == b8: Igual" );
    }   
}
