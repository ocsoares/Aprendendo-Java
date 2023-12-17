package studyNotes.POO.classNotes.toStringMethod;

public class MainCity {
    public static void main(String[] args) {
        // Ao Imprimir a INSTÂNCIA da Classe diretamente, o método "toString" da própria Classe (q herda de Object) é
        // executado, e retorna "Nome da Classe + @ + código HEX", mas pode SOBRESCREVER esse Método para RETORNAR
        // algo útil da Classe, por exemplo, um Atributo, e será retornado sempre que Imprimir a Instância da Classe!!!

        City city = new City("São Paulo", "Brazil", 12000000);
        System.out.println("city: " + city);
    }
}
