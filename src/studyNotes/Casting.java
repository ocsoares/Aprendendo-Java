package studyNotes;

public class Casting {
    public static void main(String[] args) {
        // Transforma um "int" em "long" À FORÇA!!
        // Usar = (type que o Valor será Convertido) + Valor (referenciado com a Letra SE HOUVER)
        // OBS: Isso NÃO funciona corretamente, porque ESTOURA os Bytes Máximos!
        int age = (int) 4300000000L;

        // De "double" para "float" com esse "F" no FINAl
        float salaryInFloat = 300.0F;

        float anyQuantity = (float) 236.0D;

        long otherAnyQuantity = (long) 210.30;

        System.out.println("age: " + age);
        System.out.println("salaryInFloat: " + salaryInFloat);
        System.out.println("anyQuantity: " + anyQuantity);
        System.out.println("otherAnyQuantity: " + otherAnyQuantity);
    }
}
