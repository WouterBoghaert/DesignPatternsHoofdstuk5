package be.vdab;
public class StereoKetenMain {
    public static void main(String[] args) {
        StereoKeten stereoketen = new StereoKeten();
        System.out.println();
        stereoketen.start();
        System.out.println();
        stereoketen.startCdSpeler();
        System.out.println();
        stereoketen.startRadio();
        System.out.println();
        stereoketen.startRadio();
        System.out.println();
        stereoketen.startCdSpeler();
        System.out.println();
        stereoketen.stop();
        System.out.println();
        stereoketen.start();
        System.out.println();
        stereoketen.startCdSpeler();
        System.out.println();
        stereoketen.stop();
    }
    
}
