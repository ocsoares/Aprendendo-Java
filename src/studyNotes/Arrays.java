package studyNotes;

public class Arrays {
    public static void main(String[] args) {
        // ------- PRIMEIRA FORMA de Declarar um Array!!! -------

        int[] ages = new int[3];

        // Obviamente a Posição 3 NÃO existe, é de 0-2, até para IMPRIMIR!!
        System.out.println("ages: " + ages[2]);

        System.out.println("\n");

        ages[0] = 200;
        ages[1] = 500;
        ages[2] = 722;

        System.out.println("ages ATRIBUÍDO Índice 0: " + ages[0]);
        System.out.println("ages ATRIBUÍDO Índice 1: " + ages[1]);
        System.out.println("ages ATRIBUÍDO Índice 2: " + ages[2]);

        System.out.println("\n");

        // Sempre que REDECLARA assim, o Java Garbage Collector LIMPA os Arrays!!
        // OBS: Poderia ser Redeclarado com um Array MAIOR ou MENOR, ia dar na MESMA!
        ages = new int[3];

        System.out.println("ages REDECLARADO Índice 0:" + ages[0]);
        System.out.println("ages REDECLARADO Índice 1:" + ages[1]);
        System.out.println("ages REDECLARADO Índice 2:" + ages[2]);

        System.out.println("\n");

        String[] personNames = new String[2];

        personNames[0] = "Lucas";
        personNames[1] = "Roberto";

        System.out.println("personNames Índice 0: " + personNames[0]);
        System.out.println("personNames Índice 1: " + personNames[1]);

        System.out.println("\n");

        // -----------------------------------------------------------------------

        // -----

        // ------- SEGUNDA FORMA de Declarar um Array!!! -------

        int[] otherAges = new int[]{200, 30, 12};

        System.out.println("otherAges Índice 0: " + otherAges[0]);
        // e o println dos outros arrays...

        System.out.println("\n");

        // --------------------------------------------------------------

        // -----

        // ------- TERCEIRA FORMA de Declarar um Array (ACHEI a MELHOR) !!! -------

        int[] anyNumbers = {20, 30, 100, 81}; // e mais valores...

        System.out.println("anyNumbers Índice 0: " + anyNumbers[0]);
        // e o println dos outros arrays...

        System.out.println("\n");

        // --------------------------------------------------------------

        // -----

        // ------- Arrays MULTIDIMENSIONAIS -------

        int[][] anotherAnyNumbers = {{20, 30}, {50, 200, 12}, {600, 30, 910}};

        System.out.println("anotherAnyNumbers no Índice 1, 0: " + anotherAnyNumbers[1][0]);
        System.out.println("anotherAnyNumbers no Índice 1, 1: " + anotherAnyNumbers[1][1]);
        System.out.println("anotherAnyNumbers no Índice 1, 2: " + anotherAnyNumbers[1][2]);

        // forEach do Java
        for (int[] selectedArray : anotherAnyNumbers) {
            for (int value : selectedArray) {
                System.out.println("Value: " + value);
            }
            System.out.println("-------");
        }
    }
}
