package be.vdab;
import java.math.BigDecimal;
public class Rekening {
    public BigDecimal saldo = BigDecimal.ZERO;
    public void storten(BigDecimal bedrag){
        saldo = saldo.add(bedrag);
    }
    public BigDecimal getSaldo(){
        return saldo;
    }
}
