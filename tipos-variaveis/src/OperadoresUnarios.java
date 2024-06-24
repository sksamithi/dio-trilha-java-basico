public class OperadoresUnarios {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(- numero);//Imprime o oposto da variável numero sem alterar o valor da variável.

        int numero2 = 10;
        numero2 = - numero2;//altera o valor da variável numero2 para o seu negativo.
        System.out.println(numero2);

        numero2 = - numero2;
        System.out.println(numero2);
    }
}
