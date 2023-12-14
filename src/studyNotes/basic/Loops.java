package studyNotes.basic;

public class Loops {
    public static void main(String[] args) {
        // NÃO coloquei os OUTROS Loops porque SÃO IGUAIS ao do Javascript/Typescript q eu já sei !!!!!

        // forEach
        int[] anyNumbers = {10, 30, 600, 42, 200};

        // Variável que vai RECEBER os Valores (Com o TIPO Adequado) + : + Array com os Valores
        // OBS: Dessa forma, NÃO é possível pegar os ÍNDICES!
        for (int value : anyNumbers) {
            System.out.println("Número: " + value);
        }

        System.out.println("\n");

        String[] anyNames = {"Eduardo", "Fernando", "Hugo", "João"};

        for (String value : anyNames) {
            System.out.println("Nome: " + value);
        }
    }
}
