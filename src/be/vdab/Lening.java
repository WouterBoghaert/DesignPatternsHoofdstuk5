package be.vdab;
import java.math.BigDecimal;
public class Lening {
    private BigDecimal bedrag;
    public Lening(BigDecimal bedrag){
        this.bedrag = bedrag;
    }
    public BigDecimal getBedrag(){
        return bedrag;
    }
}
