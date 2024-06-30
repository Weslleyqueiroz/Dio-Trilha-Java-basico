public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("A Smart Tv está ligada ?" + smartTv.ligada);
        System.out.println("Qual canal está a Smart Tv? " + smartTv.canal);
        System.out.println("Qual é o volume da Tv ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> tv ligada? " + smartTv.ligada);

        smartTv.Desligar();
        System.out.println("Novo status -> tv ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Qual é o volume da Tv ? " + smartTv.volume);

        
        smartTv.canalAtual(5);
        System.out.println("Canal atual: " + smartTv.canal);
      


    }
}
