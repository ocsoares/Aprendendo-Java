package studyNotes.POO.classNotes.inheritance;

public class MainWorker {
    public static void main(String[] args) {
        // ------- SEM Constructor ! -------
        System.out.println("SEM Constructor !");
        Worker worker = new Worker();
        worker.setAge(20);
        worker.setJob("Developer");
        worker.setName("Leonardo Silva");
        worker.setSalary(2500.87);
        worker.setJobDescription("Programador de internet");

        worker.getInformation();

        System.out.println("\n");

        // ------- Alterando a Instância com os Atributos "protected" ! -------
        System.out.println("Alterando a Instância com os Atributos \"protected\" !");
        worker.changeNameAndAge("Fernando Carvalho", 33);
        worker.getInformation();

        System.out.println("\n");

        // ------- COM Constructor ! -------
        System.out.println("COM Constructor !");
        Worker workerWithConstructor = new Worker(
                "Painter", 1231.87, "Roberto Gomes", 61, "Pintador de paredes de casas");
        workerWithConstructor.getInformation();
    }
}
