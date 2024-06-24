public class Relacionais {
    public static void main (String[] args) {
        String nomeUm = "Thaís";
        String nomeDois = new String("Thaís");

        System.out.println(nomeUm.equals(nomeDois));
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual a numero2?" + " " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente a numero2?" + " " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numero1 é maior a numero2?" + " " + simNao);
    }
}
