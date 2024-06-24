public class OperadoresUnarios2 {
    public static void main(String[] args) {
        int numero = 5;
        numero++;
        //numero = numero +2;
        System.out.println(numero);

        //Alternativa:
        int numero2 = 10;
        System.out.println(++ numero2);//Se eu fizer System.out.println(numero2 ++); o computador vai imprimir o numero e somente após irá icrementar.

        boolean variavel = true;
        System.out.println(!variavel);

        //Inverter o valor da booleana:
        variavel = !variavel;
        System.out.println(variavel);
    }
}
