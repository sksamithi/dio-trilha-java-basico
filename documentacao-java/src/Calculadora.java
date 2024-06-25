/** 
 * Calculadora para realização de operações básicas de matemática.
* @author Thaís 
* @version 1.0
* @since 25/06/2024
*/
public class Calculadora {
    /**
     * Método utilizado para realização de soma.
     * @param numeroUm
     * @param numeroDois
     * @return int o resultado é a soma dos parâmetros.
     */
    public int somar(int numeroUm, int numeroDois){
        return numeroUm + numeroDois;
    }
    /**
     * Método utilizado para realização de multiplicação.
     * @param numeroUm
     * @param numeroDois
     * @return int o resultado é a multiplicação dos parâmetros.
     */
    public int multiplicar(int numeroUm, int numeroDois){
        return numeroDois*numeroUm;
    }
    /**
     * Método utilizado para realização de subtração.
     * @param numeroUm
     * @param numeroDois
     * @return int o resultado é a subtração dos parâmetros.
     */
    public int subtrair(int numeroUm, int numeroDois){
        return numeroUm - numeroDois;
    }
    /**
     * Método utilizado para realização de divisão.
     * @param numeroUm
     * @param numeroDois
     * @return double o resultado é a divisão dos parâmetros.
     */
    public double dividir(int numeroUm, int numeroDois){
        return numeroUm / numeroDois;
    }
}