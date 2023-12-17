package studyNotes.POO.classNotes.toStringMethod;

public class City {
    private final String name;
    private final String country;
    private final int population;

    public City(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }

    // OBS: Foi retornado assim um pouco estranho porque eu GEREI com o próprio Template do IntelliJ, mas
    // pode também retornar simplesmente um "return this.name", por Exemplo!!!
    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", population=" + population +
                '}';
    }
}
