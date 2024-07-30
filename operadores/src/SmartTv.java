public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("Smart TV ligada!");
    }

    public void desligar(){
        ligada = false;
        System.out.println("Smart TV desligada!");
    }

    public void aumentarVolume(){
        System.out.println("aumentando volume:"+ (++volume));

    }
    public void reduzirVolume(){
        System.out.println("reduzindo volume:" + (--volume));

    }
}
