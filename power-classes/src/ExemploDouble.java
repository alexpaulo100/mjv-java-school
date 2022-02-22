
public class ExemploDouble {
    public static void main(String[] args) {
        double b = 55.05;
        double bb = Double.parseDouble("45");

        //toString() - ele retorna uma string referente ao valor double.
        //public static java.lang.String toString(double d)
        System.out.println("toString(b) = " + Double.toString(b));

        //valueOf() -esse converte de String para Wrapper(Integer, Long, etc)
        //public static java.lang.Double valueOf(double d)
        Double z = Double.valueOf(b);

        //parseDouble() - retorna o valor double ao analisar a string.
        //Difere de valueOf() porque retorna um valor duplo primitivo
        //e valueOf() retorna um objeto Double.
        //public static double parseDouble(java.lang.String s) throws java.lang.NumberFormatException

        System.out.println("parseDouble(\"45\") = " + bb);

        System.out.println("intValue = " + z.intValue());
    }
}
