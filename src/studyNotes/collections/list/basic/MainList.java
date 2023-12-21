package studyNotes.collections.list.basic;

import java.util.ArrayList;
import java.util.List;

public class MainList {

    public static void main(String[] args) {
        // Pode passar no Parâmetro de "ArrayList" a Capacidade INICIAL da Lista (Opcional)!!!
        List<String> namesList = new ArrayList<>();
        namesList.add("Henrique");
        namesList.add("Pedro");
        namesList.add(1, "Roberto"); // Adiciona o "Roberto" no Índice 1 !!

        System.out.println("Lista de NOMES: " + namesList);
        System.out.println("Tamanho da lista de NOMES: " + namesList.size());

        for (String names : namesList) {
            System.out.println("Nome da lista: " + names);
        }

        System.out.println("\n");

        List<Integer> agesList = new ArrayList<>();
        agesList.add(24);
        agesList.add(18);
        agesList.add(35);
        agesList.add(87);

        System.out.println("Lista de IDADES: " + agesList);
        System.out.println("Tamanho da lista de IDADES: " + agesList.size());

        for (int ages : agesList) {
            System.out.println("Idades da lista: " + ages);
        }

        System.out.println("\n");

        List<String> stringList = new ArrayList<>();
        stringList.add("Bola");
        stringList.add("Cenoura");
        stringList.add("Macarrão");
        stringList.add("Cenoura");

        System.out.println("stringList ANTES: " + stringList);
        stringList.remove(2);
        stringList.remove("Macarrão");
        stringList.removeIf(value -> value.equals("Cenoura")); // Remove TODAS as strings "Cenoura" do Array!!!
        System.out.println("stringList DEPOIS: " + stringList);

        stringList.addAll(namesList);
        System.out.println("Adicionando namesList à stringList: " + stringList);

        stringList.clear();
        System.out.println("Limpando o stringList: " + stringList);
    }
}
