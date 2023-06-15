import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        //Exemplo sinonimos computador:
        ArrayList<String> sinonimos_computador = new ArrayList<>();
        sinonimos_computador.add("pc");
        sinonimos_computador.add("laptop");

        dicionario.insereTermoSimples("Garrafa", "Bottle", "Botoul");
        dicionario.insereTermoCompleto("Computador", "Computer", sinonimos_computador);

        System.out.println(dicionario.traduz("Garrafa"));
        System.out.println(dicionario.traduz("Computador"));
        dicionario.remover("Garrafa");
        System.out.println(dicionario.traduz("Garrafa"));
    }
}