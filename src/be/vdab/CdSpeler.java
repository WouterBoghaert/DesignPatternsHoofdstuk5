package be.vdab;
public class CdSpeler implements Geluidsbron {
    @Override
    public void start (){
        System.out.println("De cd speler is gestart");
    }
    @Override
    public void stop(){
        System.out.println("De cd speler is gestopt");
    }
}
