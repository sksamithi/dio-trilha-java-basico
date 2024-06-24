public class Operadores2 {
    public static void main(String[] args) {
        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;//Ele identifica o numero, mas a partir do segundo ele faz a concatenação apenas, não consegue voltar a ser número.
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);//Como tem evidência, primeiro ele faz a soma e depois faz a concatenação.
        System.out.println(concatenacao);
    }
}
