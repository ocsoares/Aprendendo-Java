package studyNotes.POO.classNotes.arraysWithObjects;

public class MainWheel {
    public static void main(String[] args) {
        Wheel wheel = new Wheel("Aosen", 12.3);
        Wheel wheel2 = new Wheel("Ceat", 20.9);
        Wheel[] arrayWheel = {wheel, wheel2};

        for (Wheel wheelClass : arrayWheel) {
            wheelClass.getInformation();
            System.out.println("\n");
        }
    }
}
