public class Controle {
    public static void main(String[] args) throws Exception {
        TvJava tv = new TvJava();

        System.out.println("TV Ligada? : " + tv.ligada);
        System.out.println("Canal atual : " + tv.canal);
        System.out.println("Volume atual : " + tv.volume);

        tv.ligar();
        System.out.println("TV Ligada? - Novo Status : " + tv.ligada);

        tv.desligar();
        System.out.println("TV Ligada? - Novo Status : " + tv.ligada);
        
        tv.diminuirVolume();
        System.out.println("Volume atual : " + tv.volume);
        tv.diminuirVolume();
        System.out.println("Volume atual : " + tv.volume);

        tv.aumentarCanal();
        System.out.println("Canal atual : " + tv.canal);
        tv.aumentarCanal();
        System.out.println("Canal atual : " + tv.canal);

        tv.mudarParaCanal(12);
        System.out.println("Canal atual : " + tv.canal);

        tv.mudarParaCanal(33);
        System.out.println("Canal atual : " + tv.canal);

    
    
    }
    
}
