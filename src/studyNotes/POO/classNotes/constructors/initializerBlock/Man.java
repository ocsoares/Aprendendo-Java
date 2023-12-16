package studyNotes.POO.classNotes.constructors.initializerBlock;

public class Man {
    private int age;
    private String name;

    // Bloco de Inicialização
    {
        System.out.println("Executando o Bloco de inicialização !!");
        this.age = 200;
    }

    public Man() {
        this.age = 27;
    }

    // Como esse Constructor com Parâmetro NÃO ATRIBUI o "this.age = 27", então ao Instanciar a Classe com ele e
    // usar o "getAge" vai retornar 0!!!
    // --------------------------------------------
    // OBS: Para isso, precisa usar o Bloco de Inicialização, que vai ser Executado TODAS às Vezes que o Objeto
    // for INSTANCIADO, ou seja, ANTES de TUDO!!
    // --------------------------------------------
    // OBS2: Nesse Constructor com Parâmetro o "age" vai ser 200 porque ele vai Receber esse Valor ao ser
    // INICIALIZADO, já o public Man() sem Parâmetros retorna 27 porque ele TAMBÉM recebe 200, mas logo depois
    // REATRIBUI para 27!!
    public Man(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}
