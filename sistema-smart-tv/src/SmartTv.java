public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

   
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        volume ++;

    public void diminuirCanal(){
        volume --;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("aumentar volume para: " + volume);

    }

    public void diminuirVolume() {
        volume--;
        System.out.println("diminuir volume para: " + volume);

    }

}
