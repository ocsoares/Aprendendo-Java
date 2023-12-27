package studyNotes.designPatterns.builder;

// É Recomendado usar o padrão "Builder" quando o Constructor da Classe pede muitos Atributos e pode ficar difícil
// de lembrar os Campos exatos!!!
public class MainBuilder {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder.Builder().name("João Lopes")
                .age(32)
                .city("Mato Grosso")
                .build();

        System.out.println("personBuilder: " + personBuilder);
    }
}
