public class Ternarios {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;
        String resultado = "";

        if (a==b)
            resultado = "verdadeiro";
        else 
            resultado = "falso";
        
        System.out.println(resultado);

        //É possível substituir o if pelo ternário:

        String resultado2 = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado2);
    }
}
