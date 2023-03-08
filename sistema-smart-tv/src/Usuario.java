public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        smartTv.mudarCanal(13);
        System.out.println("volume atual " + smartTv.volume);

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("canal atual : " + smartTv.canal);
        System.out.println("volume atual : " + smartTv.volume);

        /*
         * SmartTv.ligar();
         * System.out.println("novo status -> TV Ligada ?" + smartTv.ligada);
         * 
         * SmartTv.desligar();
         * System.out.println("novo status -> TV Ligada ?" + smartTv.ligada);
         */
    }
}
