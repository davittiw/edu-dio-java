public class usuario {
    public static void main(String[] args) throws Exception{
        smartTv SmartTv = new smartTv();

        System.out.println("Canal inicial: " + SmartTv.canal);
        SmartTv.mudarCanal(  13);
        System.out.println("Canal atual: " + SmartTv.canal);

        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        System.out.println("Volume atual: " + SmartTv.volume);

        System.out.println("Tv ligada: " + SmartTv.ligada);

        SmartTv.ligar();
        System.out.println("Novo status - Tv ligada: " + SmartTv.ligada);

        SmartTv.desligar();
        System.out.println("Novo status - Tv desligada: " + SmartTv.ligada);
    }
}