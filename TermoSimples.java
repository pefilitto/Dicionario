public class TermoSimples extends Termo{
    private String pronuncia;

    public String getPronuncia() {
        return pronuncia;
    }

    public void setPronuncia(String pronuncia) {
        this.pronuncia = pronuncia;
    }

    public TermoSimples(String termo, String traducao, String pronuncia) {
        super(termo, traducao);
        this.pronuncia = pronuncia;
    }
}
