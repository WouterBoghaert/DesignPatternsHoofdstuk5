package be.vdab;
import java.util.ArrayList;
import java.util.List;
public class Persoon {
    private Beroepsinkomsten beroepsinkomsten;
    private Rekening rekening;
    private final List<Lening> leningen = new ArrayList<>();
    public Persoon(Beroepsinkomsten beroepsinkomsten, Rekening rekening){
        this.beroepsinkomsten = beroepsinkomsten;
        this.rekening = rekening;
    }
    public void addLening(Lening lening){
        leningen.add(lening);
    }
    public Beroepsinkomsten getBeroepsinkomsten(){
        return beroepsinkomsten;
    }
    public Rekening getRekening(){
        return rekening;
    }
    public List<Lening> getLeningen(){
        return leningen;
    }
}
