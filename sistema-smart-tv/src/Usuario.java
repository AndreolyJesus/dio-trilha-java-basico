public class Usuario {

    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("canal atual : " + smartTv.canal);
        System.out.println("volume atual : " + smartTv.volume);
    }
}