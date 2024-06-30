public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);

    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
        
    }

    public void ligar(){
        ligada = true;
    }
    public void Desligar(){
        ligada = false;
    }

    public void aumentarCanal(){
        canal++;
    }
    
    public void diminuirCanal(){
        canal--;
    }

    public void canalAtual(int novoCanal ){
        canal = novoCanal;
    }

    
}
