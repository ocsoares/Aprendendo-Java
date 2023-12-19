package studyNotes.exceptions.basicExceptions;

import java.io.IOException;

public class BasicException {
    public static void doSomething() {
        try {
            // Faz qualquer coisa...
            System.out.println("Apenas fazendo alguma coisa...");
        } catch (Exception exception) {
//            exception.printStackTrace();
            exception.fillInStackTrace();
        }
    }

    // Usando um "throws + alguma Exception" significa que esse Método PODE resultar nessa determinada
    // Exception, e que a Classe que for utilizar esse Método PRECISA TRATAR ele!!!
    // -------------------------------------------------------------------------------------
    // OBS: Se o Método for "private" NÃO é necessário usar esse "throws", porque ele NÃO vai ser utilizado
    // FORA dessa Classe, então logo DEVE ser Tratado na PRÓPRIA Classe!!!
    public static void justDo() throws IOException {
        System.out.println("Apenas fazendo algo no justDo...");
    }

    // Nesse caso aqui NÃO necessariamente precisa colocar "throws IllegalArgumentException", porque ele
    // é UNCHECKED, ou seja, esse Erro é RUNTIME, NÃO precisa Tratar com um "try catch" porque VAI dar
    // ERRO direto de COMPILAÇÃO!!!
    public static double division(double number, double otherNumber) throws IllegalArgumentException {
        if (number == 0 || otherNumber == 0) {
            throw new IllegalArgumentException("Não é possível dividir por 0 !");
        }

        return number / otherNumber;
    }

    // VÁRIOS "catch" em um "try catch" !!
    // ---------------------------------------------
    // OBS: O "RuntimeException" DEVE ser o ÚLTIMO "catch", porque se NÃO entrar em NENHUM dos Catch Anteriores,
    // IRÁ entrar "RuntimeException", que a Classe PAI das Exceptions (a mais Genérica)!!!
    // ----------------------------------------------------------------------------------------------------------
    // OBS2: Também É POSSÍVEL usar VÁRIOS "throws" no Método!!!
    public static void severalExceptions() throws ArrayIndexOutOfBoundsException, IllegalArgumentException,
            ArithmeticException {

        // Nesse exemplo de "Multi catch em linha", as Exceptions na Mesma Linha NÃO podem ter a Mesma HERANÇA!!!
        try {
            System.out.println("Faz algo no severalExceptions...");
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException exception) {
            System.out.println("Exception entre VÁRIAS Exceptions: " + exception);
        } catch (RuntimeException exception) {
            System.out.println("Catch RuntimeException !!" + exception);
        }
    }
}
