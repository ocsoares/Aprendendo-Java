package studyNotes.collections.sort.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainSort {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("Maria");
        namesList.add("Caio");
        namesList.add("Pedro");
        namesList.add("Ana");
        namesList.add("João");
        namesList.add("Bárbara");

        System.out.println("namesList ANTES do sort: " + namesList);

        Collections.sort(namesList); // Organiza a Lista em Ordem ALFABÉTICA!

        System.out.println("namesList DEPOIS do sort: " + namesList);

        List<Double> salaryList = new ArrayList<>();
        salaryList.add(2000.00);
        salaryList.add(1430.00);
        salaryList.add(810.93);
        salaryList.add(5700.90);
        salaryList.add(1090.87);

        Collections.sort(salaryList); // Organiza a Lista em Ordem NUMÉRICA (do MENOR para o MAIOR)!!
        System.out.println("salaryList com sort: " + salaryList);
    }
}
