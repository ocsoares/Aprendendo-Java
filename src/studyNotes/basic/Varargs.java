package studyNotes.basic;

public class Varargs {
    public static void main(String[] args) {
        int[] anyNumbers = {230, 57};

        // Usando dessa forma, PRECISA passar um Array DECLARADO!!!
        Varargs.withoutVarargs(anyNumbers);

        System.out.println("\n");

        // Dessa forma, NÃO precisa passar um Array Declarado, pode passar DIRETAMENTE os
        // Valores porque o Varargs CONVERTE AUTOMATICAMENTE para um ARRAY!!!
        Varargs.withVarargs(39, 852);
    }

    public static void withoutVarargs(int[] num) {
        System.out.println("withoutVarargs números: ");

        for (int value : num) {
            System.out.println(value);
        }
    }

    // IMPORTANTE: O Parâmetro do Varargs deve ser o ÚLTIMO, se não dá ERRO!!!
    // Exemplo CERTO: (int... num) ou (String name, int... num)
    // Exemplo ERRADO: (int... num, String description)
    public static void withVarargs(int... num) {
        System.out.println("withVarargs números: ");

        for (int value : num) {
            System.out.println(value);
        }
    }
}
