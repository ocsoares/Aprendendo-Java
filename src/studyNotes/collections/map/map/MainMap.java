package studyNotes.collections.map.map;

import java.util.HashMap;
import java.util.Map;

// O "HashMap" NÃO mantém a ORDEM, ele Ordena conforme o "hashCode", para MANTER a Ordem, usar "LinkedHashMap" !!!
public class MainMap {
    public static void main(String[] args) {
        Map<String, Integer> namesWithNumber = new HashMap<>();
        namesWithNumber.put("Maria", 1);
        namesWithNumber.put("Pedro", 2);
        namesWithNumber.put("Carlos", 3);
        namesWithNumber.put("Guilherme", 4);
        namesWithNumber.put("Carlos", 5); // SOBRESCREVE o Valor da Chave se ela JÁ EXISTIR!!
        namesWithNumber.putIfAbsent("Guilherme", 6); // Só adiciona uma Chave se ela NÃO EXISTIR (NÃO Sobrescreve)!
        namesWithNumber.put("Guilherme Irmão", 4); // Chave com Valor DIFERENTE é PERMITIDO!

        System.out.println("namesWithNumber: " + namesWithNumber);

        System.out.println("\n");

        // Retorna apenas as CHAVES!
        for (String key : namesWithNumber.keySet()) {
            System.out.println("keys: " + key);
        }

        System.out.println("\n");

        // Retorna apenas os VALORES!
        for (Integer value : namesWithNumber.values()) {
            System.out.println("value: " + value);
        }

        System.out.println("\n");

        // Retornando as CHAVES e o VALOR das Chaves!!
        // ---------------------------------------------
        // OBS: Maneira mais CORRETA!!
        for (Map.Entry<String, Integer> entry : namesWithNumber.entrySet()) {
            System.out.println("MAIS CORRETO -- keys: " + entry.getKey() + " ||" + " values: " + entry.getValue());
        }

        System.out.println("\n");

        // Retornando as CHAVES e o VALOR das Chaves!!
        for (String key : namesWithNumber.keySet()) {
            System.out.println("keys: " + key + " ||" + " values: " + namesWithNumber.get(key));
        }
    }
}
