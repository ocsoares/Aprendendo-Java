package studyNotes.collections.map.navigableMap;

import studyNotes.collections.sort.sortWithObjects.binarySearch.PersonComparable;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

// É a MESMA COISA de "Map", só que para o "Navigable", que é uma Collection de sort !!!
// ----------------------------------------------------------------------------------------
// OBS: O VALOR NÃO precisa implementar o "compareTo" ou "compare", pois o "NavigableMap"
// Ordena pela CHAVE!!
public class MainNavigableMap {
    public static void main(String[] args) {
        NavigableMap<String, PersonComparable> personNavigableMapByAge = new TreeMap<>();
        personNavigableMapByAge.put("Carlos Silva", new PersonComparable("Carlos Silva", 24, "São Paulo"));
        personNavigableMapByAge.put("Bárbara Santos", new PersonComparable("Bárbara Santos", 19, "Curitiba"));
        personNavigableMapByAge.put("Douglas Henrique", new PersonComparable("Douglas Henrique", 31, "Rio de Janeiro"));
        personNavigableMapByAge.put("Antônia Carvalho", new PersonComparable("Antônia Carvalho", 24, "Santa Catarina"));

        for (Map.Entry<String, PersonComparable> entry : personNavigableMapByAge.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\n");

        // headMap = Retorna TODAS as Chaves/Valores de ANTES (A CIMA) de uma Determinada CHAVE!!!
        // ----------------------------------------------------------------------------------------
        // OBS: O segundo Parâmetro de "headMap" é o "inclusive", responsável por INCLUIR ou NÃO
        // a Chave Informada no Retorno!!
        System.out.println("headMap:" + personNavigableMapByAge.headMap("Douglas Henrique"));
    }
}
