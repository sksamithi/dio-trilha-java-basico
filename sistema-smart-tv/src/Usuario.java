public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual" + ":" + smartTv.canal);
        smartTv.mudarCanal(5);
        
        System.out.println("Volume atual" + ":" + smartTv.volume);

        System.out.println("TV ligada ?" + " " + smartTv.ligado);
        System.out.println("Canal atual" + ":" + smartTv.canal);
        System.out.println("Volume atual" + ":" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Atualização: TV ligada ?" + " " + smartTv.ligado);
    
        smartTv.desligar();
        System.out.println("Atualização: TV ligada ?" + " " + smartTv.ligado);
    }
}
