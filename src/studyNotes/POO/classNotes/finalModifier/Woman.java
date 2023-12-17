package studyNotes.POO.classNotes.finalModifier;

// Usando um "final" na Classe significa que essa Classe NÃO pode ser HERDADA (extends) para Outra Classe!!!
public final class Woman {
    // OBS: "final" é o "readonly" do Java, em que um Atributo/Método NÃO pode ser ALTERADO!!!
    // Também é muito COMUM usar "final" com "static" quando um Atributo é DECLARADO com eles, por
    // exemplo, "private static final String job = "Painter"" !!!

    public final String NAME = "Carol";
    public final int AGE = 24;
    public static final String JOB = "Receptionist";

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + NAME + '\'' +
                ", age=" + AGE +
                '}';
    }

    // Usando "final" no MÉTODO impede que ele seja SOBRESCRITO!
    // --------------------------------------------------------------
    // OBS: Comentei esse Método porque nesse caso, como a CLASSE já é "final", então NÃO tem necessidade do Método
    // também ser "final", porque ele NÃO vai poder ser Sobrescrito já que a CLASSE NÃO vai poder ser Herdada!!!
//    public final void printAnyPhrase() {
//        System.out.println("Apenas uma frase qualquer....");
//    }
}
