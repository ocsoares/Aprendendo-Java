package studyNotes.POO.classNotes.arraysWithObjects;

public class Wheel {
    private final String name;
    private final double size;

    public Wheel(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public void getInformation() {
        System.out.println("name: " + this.name);
        System.out.println("size: " + this.size);
    }
}
