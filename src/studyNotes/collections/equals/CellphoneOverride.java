package studyNotes.collections.equals;

public class CellphoneOverride {
    private final String name;
    private final String uniqueID;

    public CellphoneOverride(String name, String uniqueID) {
        this.name = name;
        this.uniqueID = uniqueID;
    }

    // Sobrescrevendo esse Método para comparar se o "uniqueID" de dois Objetos DIFERENTES
    // são IGUAIS!!!
    // OBS: Essas Verificações no Método são OBRIGATÓRIAS!!
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        // this = O OBJETO que está usando o Método "equals" !!
        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        // Variável "cellphoneOverride" do tipo "Cellphone" que se referencia ao "obj" com
        // o Casting para "CellphoneOverride"!!
        CellphoneOverride cellphoneOverride = (CellphoneOverride) obj;

        // Retorna um "boolean" checando se uniqueID é Diferente de null e se também é IGUAL
        // ao uniqueID do Objeto a ser COMPARADO "cellphoneOverride"!!!
        return this.uniqueID != null && this.uniqueID.equals(cellphoneOverride.uniqueID);
    }

    // Quando faz um Override no "equals" PRECISA Também fazer um Override no método "hashCode",
    // responsável em, por exemplo, em um Array de Objetos, BUSCAR um ATRIBUTO do Objeto pelo hashCode dele,
    // ao invés de Buscar e Comparar com CADA Atributo, MELHORANDO o DESEMPENHO do Algorítmo!!
    @Override
    public int hashCode() {
        // O número "0" é o retorno PADRÃO do hashCode!
        return this.uniqueID == null ? 0 : this.uniqueID.hashCode();
    }
}
