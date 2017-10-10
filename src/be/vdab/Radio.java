package be.vdab;
public class Radio implements Geluidsbron {
    @Override
    public void start (){
        System.out.println("De radio is gestart");
    }
    @Override
    public void stop(){
        System.out.println("De radio is gestopt");
    }
}
