abstract class Termo {
    protected String termo;
    protected String traducao;

    public String getTermo() {
        return termo;
    }

    public void setTermo(String termo) {
        this.termo = termo;
    }

    public String getTraducao() {
        return traducao;
    }

    public void setTraducao(String traducao) {
        this.traducao = traducao;
    }

    public Termo(String termo, String traducao) {
        this.termo = termo;
        this.traducao = traducao;
    }
}
