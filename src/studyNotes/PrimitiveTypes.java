package studyNotes;

public class PrimitiveTypes {
    public static void main(String[] args) {
        int personAge = 32;
        long accumulatedMoney = 2800000;
        double salaryInDouble = 45000; // same as float, but double has more bytes
        float salaryInFloat = 4500;
        byte houseNumber = 127; // 1 byte
        short petAge = 17; // 2 byte
        boolean isTrue = true;
        boolean isFalse = false;
        char gender = 'M';

        System.out.println("personAge:" + personAge);
        System.out.println("accumulatedMoney:" + accumulatedMoney);
        System.out.println("salaryInDouble:" + salaryInDouble);
        System.out.println("salaryInFloat:" + salaryInFloat);
        System.out.println("houseNumber:" + houseNumber);
        System.out.println("petAge:" + petAge);
        System.out.println("isTrue:" + isTrue);
        System.out.println("isFalse:" + isFalse);
        System.out.println("gender:" + gender);
    }
}
