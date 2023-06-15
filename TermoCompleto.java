import java.util.List;

public class TermoCompleto extends Termo{
    List<String> sinonimos;

    public List<String> getSinonimos() {
        return sinonimos;
    }

    public void setSinonimos(List<String> sinonimos) {
        this.sinonimos = sinonimos;
    }

    public TermoCompleto(String termo, String traducao, List<String> sinonimos) {
        super(termo, traducao);
        this.sinonimos = sinonimos;
    }
}
