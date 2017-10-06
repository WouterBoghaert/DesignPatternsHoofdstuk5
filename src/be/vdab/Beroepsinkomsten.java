package be.vdab;
import java.math.BigDecimal;
public class Beroepsinkomsten {
    private BigDecimal maandWedde;
    public Beroepsinkomsten(BigDecimal maandWedde){
        this.maandWedde = maandWedde;
    }
    public BigDecimal getMaandWedde(){
        return maandWedde;
    }
}
