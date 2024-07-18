public class smartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("volume aumentado em: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("volume diminuido em: " + volume);
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}
