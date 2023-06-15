import java.util.ArrayList;
import java.util.List;

public class Dicionario {
    private List <Termo> dicionario;
    public Dicionario(){
        dicionario = new ArrayList<>();
    }

    public void insereTermoSimples(String palavra, String traducao, String pronuncia){
        dicionario.add(new TermoSimples(palavra, traducao, pronuncia));
    }

    public void insereTermoCompleto(String palavra, String traducao, List<String> sinonimos){
        dicionario.add(new TermoCompleto(palavra, traducao, sinonimos));
    }

    public String traduz(String palavra){
        int ok=0;
        for (int i = 0; i < dicionario.size(); i++) {
            if(dicionario.get(i).getTermo().equalsIgnoreCase(palavra)){
                if(dicionario.get(i) instanceof TermoSimples){
                    return "Traducao: " + dicionario.get(i).getTraducao() + " | " + "Pronuncia: " + ((TermoSimples) dicionario.get(i)).getPronuncia();
                }
                else{
                    return "Traducao: " + dicionario.get(i).getTraducao() + " | " + "Lista de Sinonimos: " + ((TermoCompleto) dicionario.get(i)).getSinonimos();
                }
            }
        }

        return "Nenhuma traducao encontrada em todo o dicionario";
    }

    public Boolean remover(String palavra){
        for (int i = 0; i < dicionario.size(); i++) {
            if(dicionario.get(i).termo.equalsIgnoreCase(palavra)) {
                dicionario.remove(i);
                return true;
            }
        }
        return false;
    }

}
