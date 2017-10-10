package be.vdab;

public class StereoKeten {
    private Versterker versterker = new Versterker();
    private Equalizer equalizer = new Equalizer();
    private Radio radio = new Radio();
    private CdSpeler cdSpeler = new CdSpeler();
    //private boolean laatstRadio = true;
    private Geluidsbron huidigeGeluidsbron = radio;
    private boolean gestart;
    
    public void start(){
        versterker.start();
        equalizer.start();
//        if (huidigeGeluidsbron.equals(radio)){
//            radio.start();
//        }
//        else {
//            cdSpeler.start();
//            huidigeGeluidsbron = cdSpeler;
//        }
        huidigeGeluidsbron.start();
        gestart = true;
    }
    
    public void stop(){
        versterker.stop();
        equalizer.stop();
//        if (huidigeGeluidsbron.equals(radio)){
//            radio.stop();
//        }
//        else {
//            cdSpeler.stop();
//        }
        huidigeGeluidsbron.stop();
        gestart = false;
    }
    
    public void startRadio(){
        if(gestart){
            if (huidigeGeluidsbron.equals(radio)){
                System.out.println("radio is al gestart");
            }
            else {
                cdSpeler.stop();
                radio.start();
                huidigeGeluidsbron = radio;
            }
        }
    }
    
    public void startCdSpeler(){
        if(gestart){
            if (huidigeGeluidsbron.equals(radio)){
                radio.stop();
                cdSpeler.start();
                huidigeGeluidsbron = cdSpeler;
            }
            else {
                System.out.println("cd speler is al gestart");
            }
        }
    }
}
