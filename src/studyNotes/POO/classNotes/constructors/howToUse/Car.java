package studyNotes.POO.classNotes.constructors.howToUse;

public class Car {
    private String brand;
    private int year;
    private String city;

    // O CONSTRUTOR de uma Classe em Java se Declara ASSIM, com a Variável de Acesso + Nome da CLASSE!!
    // OBS: NÃO pode ter NENHUM TIPO de RETORNO!!
    public Car(String brand) {
        this.brand = brand;
    }

    // O Constructor em Java também pode ser SOBRECARREGADO!!!
    public Car(String brand, int year) {
        // this() = é a forma do Java de USAR o CONSTRUCTOR da CLASSE!!
        // OBS: SÓ pode ser usado dentro de CONSTRUCTORS, por exemplo, em Métodos NÃO funciona!!
        // OBS2: Quando usado, TEM que OBRIGATORIAMENTE estar na PRIMEIRA LINHA (Executável) do Constructor!
        this(brand);
        this.year = year;
    }

    public Car(String brand, int year, String city) {
        this(brand, year);
        this.city = city;
    }

    // Também pode Sobrecarregar o Constructor para ele ser OPCIONAL!!!
    public Car() {

    }

    public void getInformation() {
        System.out.println("brand: " + this.brand);
        System.out.println("year: " + this.year);
        System.out.println("city: " + this.city);
    }
}
