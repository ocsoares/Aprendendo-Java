package studyNotes.collections.convertingListsAndArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainListsAndArrays {
    public static void main(String[] args) {
        // ------- LISTA para Arrays ! -------
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(34);
        numbersList.add(8);
        numbersList.add(240);

        System.out.println("numbersList: " + numbersList);

        // Por questões de PERFORMANCE, é mais Recomendado usar "new Integer[0]" do que
        // "new Integer[numbersList.size]" !!!
        Integer[] numbersArray = numbersList.toArray(new Integer[0]);
        System.out.println("numbersArray: " + Arrays.toString(numbersArray));

        System.out.println("\n");

        // ------- Arrays para LISTA ! -------

        Integer[] otherNumbersArray = {20, 700, 90, 2, 30};
        System.out.println("otherNumbersArray: " + Arrays.toString(otherNumbersArray));

        List<Integer> otherNumbersList = new ArrayList<>(Arrays.asList(otherNumbersArray));
        System.out.println("otherNumbersList: " + otherNumbersList);
    }
}
