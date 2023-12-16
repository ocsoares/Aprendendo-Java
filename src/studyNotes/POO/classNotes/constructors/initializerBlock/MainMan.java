package studyNotes.POO.classNotes.constructors.initializerBlock;

public class MainMan {
    public static void main(String[] args) {
        Man man = new Man();
        int manAge = man.getAge();
        System.out.println("manAge: " + manAge);

        System.out.println("\n");

        Man man2 = new Man("João");
        int man2Age = man2.getAge();
        System.out.println("man2Age: " + man2Age);
    }
}
