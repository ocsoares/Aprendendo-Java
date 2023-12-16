package studyNotes.POO.classNotes.staticAttributesAndMethods;

public class Motorcycle {
    // IMPORTANTE: Usar Atributos/Métodos STATIC quando esses NÃO forem utilizados para cada
    // Instância da Classe, por exemplo, se uma Classe NÃO tem Atributos, TODOS os Métodos dela
    // podem ser STATIC!!!

    private final String brand;
    private final int year;

    // Usando dessa maneira, será setado "maxSpeed = 200" para cada Instância da Classe de
    // forma INDEPENDENTE!!!
//    private int maxSpeed = 250;

    // Já usando o "static", o maxSpeed será Alterado no setter "setMaxSpeed" para TODAS as
    // Instâncias da Classe, pois agora é uma Propriedade da CLASSE, e não de Instâncias!!!
    private static int maxSpeed = 250;

    // O Bloco de Inicialização também pode ser STATIC, mas assim ele só será executado apenas
    // UMA VEZ, ANTES de TUDO!!!
    // ----------------------------------
    // OBS: Podem ter VÁRIOS Blocos de Inicialização STATIC, porque eles serão executados na
    // ORDEM em que foram declarados!!
    static {
        System.out.println("Executando o Bloco de Inicialização !");
    }
    
    public Motorcycle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public static void setMaxSpeed(int maxSpeed) {
        Motorcycle.maxSpeed = maxSpeed;
    }

    public void getInformation() {
        System.out.println("brand: " + this.brand);
        System.out.println("year: " + this.year);
        System.out.println("maxSpeed: " + maxSpeed);
    }
}
