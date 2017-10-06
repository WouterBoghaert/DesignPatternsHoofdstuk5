package be.vdab;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        Persoon persoon = new Persoon(
            new Beroepsinkomsten(BigDecimal.valueOf(3000)), new Rekening());
        LeningVerstrekker verstrekker = new LeningVerstrekker();
        if (verstrekker.isLeningGoedgekeurd(persoon)){
            System.out.println("Lening goedgekeurd");
        }
        else {
            System.out.println("Lening afgekeurd");
        }
        
//        if (persoon.getBeroepsinkomsten().getMaandWedde()
//                .compareTo(BigDecimal.valueOf(2500)) >=0
//                && persoon.getRekening().getSaldo().compareTo(BigDecimal.ZERO) > 0
//                && persoon.getLeningen().isEmpty()){
//                System.out.println("Lening goedgekeurd");
//        }
//        else {
//            System.out.println("Lening afgekeurd");
//        }
    }
    
}
