package studyNotes.exceptions.tryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyReader {
    private MyReader() {
    }

    // Usar esse "try catch with resources" APENAS quando for Necessário usar Classes que IMPLEMENTAM as Interfaces
    // "Closeable" ou "AutoCloseable", porque dessa maneira o Próprio Java é responsável por FECHAR a Execução desses
    // Métodos, seja ele um BANCO DE DADOS ou um LEITOR DE ARQUIVO, por exemplo!!!
    public static void readFile(String filename) {
        try (Reader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("Tentando ler o Arquivo de nome: " + filename);
            System.out.println("READER: " + reader);
        } catch (IOException exception) {
            System.out.println("NÃO foi possível ler o Arquivo de nome: " + filename);
            System.out.println("IOException: " + exception);
        }
    }
}
