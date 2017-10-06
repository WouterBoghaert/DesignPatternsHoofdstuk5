package be.vdab;

public class StereoKeten {
    private Versterker versterker = new Versterker();
    private Equalizer equalizer = new Equalizer();
    private Radio radio = new Radio();
    private CdSpeler cdSpeler = new CdSpeler();
    private boolean laatstRadio = true;
    
    public void start(){
        versterker.start();
        equalizer.start();
        if (laatstRadio){
            radio.start();
        }
        else {
            cdSpeler.start();
        }
    }
    
    public void stop(){
        versterker.stop();
        equalizer.stop();
        if (laatstRadio){
            radio.stop();
        }
        else {
            cdSpeler.stop();
        }
    }
    
    public void startRadio(){
        if (laatstRadio){
            System.out.println("radio is al gestart");
        }
        else {
            cdSpeler.stop();
            radio.start();
            laatstRadio = true;
        }
    }
    
    public void startCdSpeler(){
        if (laatstRadio){
            radio.stop();
            cdSpeler.start();
            laatstRadio = false;
        }
        else {
            System.out.println("cd speler is al gestart");
        }
    }
}
