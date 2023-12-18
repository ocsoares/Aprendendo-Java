package studyNotes.POO.classNotes.interfaces;

public interface Bird {
    // POR PADRÃO, TODOS os ATRIBUTOS das Interfaces são do tipo "public static final", então NÃO é necessário declarar
    // com eles!!!
    int age = 10;

    // É possível declarar Métodos ESTÁTICOS (que pertencem à Interface), mas eles NÃO podem ser SOBRESCRITOS e DEVEM
    // ser IMPLEMENTADOS Diretamente na Interface!!!
    // ---------------------------------------------------
    // OBS: Devem ser Invocados DIRETAMENTE da Interface, nesse caso, "Bird.staticDrinkWater();"!!!
    // ---------------------------------------------------
    // OBS2: NÃO é necessário colocar "public" porque já é Colocado por Padrão!!
    static void staticDrinkWater() {
        System.out.println("O PÁSSARO STATIC está bebendo água !");
    }

    // Usar o "default" para IMPLEMENTAR MÉTODOS na Interface, com isso, as Classes que forem Implementar essa
    // Interface NÃO precisam Sobrescrever esse Método (mas PODE, se quiser) e as Instâncias PODEM chamar diretamente
    // esse Método!!!
    default void drinkWater() {
        System.out.println("O PÁSSARO está bebendo água !");
    }

    // Por PADRÃO, TODOS os MÉTODOS de Interfaces são ABSTRATAS, então NÃO é necessário colocar "public abstract",
    // por exemplo!!!
    void sing();
}
