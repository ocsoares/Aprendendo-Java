package studyNotes.collections.equals;

public class MainCellphone {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone("Iphone X", "d910-530");
        Cellphone cellphoneTwo = new Cellphone("Samsung Galaxy", "d910-530");

        // Obviamente retorna FALSE, porque o "equals" Compara se os OBJETOS são IGUAIS, e dessa forma NUNCA
        // serão porque Mesmo se os Objetos tiverem os MESMOS ATRIBUTOS, Também retornará "false", pois CONTINUAM
        // sendo Objetos DIFERENTES!!!
        System.out.println("Verificando se os Cellphones são IGUAIS: " + cellphone.equals(cellphoneTwo));

        // Dessa forma o "equals" retornará TRUE, porque são Objetos IGUAIS em MEMÓRIA!!!
        Cellphone sameCellphone = cellphone;
        System.out.println("sameCellphone é equals a cellphone?: " + sameCellphone.equals(cellphone));

        // Usando o "equals" SOBRESCRITO de "CellphoneOverride" para verificar se os uniqueID dos Objetos são IGUAIS!!!
        CellphoneOverride cellphoneOverride = new CellphoneOverride("Iphone 13", "xb80-215");
        CellphoneOverride cellphoneOverrideTwo = new CellphoneOverride("Galaxy Note 20", "xb80-215");
        System.out.println("cellphoneOverride é equals a cellphoneOverrideTwo?: " + cellphoneOverride.equals(
                cellphoneOverrideTwo));
        System.out.println("cellphoneOverride é equals a cellphone?: " + cellphoneOverride.equals(cellphone));
    }
}
