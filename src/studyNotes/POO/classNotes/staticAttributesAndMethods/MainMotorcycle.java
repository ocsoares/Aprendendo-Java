package studyNotes.POO.classNotes.staticAttributesAndMethods;

public class MainMotorcycle {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle("Honda", 2011);
        motorcycle.getInformation();

        System.out.println("\n");

        // Alterando o maxSpeed de "motorcycle1" e de "motorcycle2" usando o Método STATIC "setMaxSpeed" que
        // é um método da CLASSE, e não de Instâncias, refletindo em TODAS as Instâncias da Classe!!!
        Motorcycle.setMaxSpeed(120);

        Motorcycle motorcycle1 = new Motorcycle("Yamaha", 2017);
        motorcycle1.getInformation();

        System.out.println("\n");

        Motorcycle motorcycle2 = new Motorcycle("Biz", 2009);
        motorcycle2.getInformation();
    }
}
