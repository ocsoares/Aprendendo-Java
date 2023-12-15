package studyNotes.POO.classNotes.gettersAndSetters;

public class MainDog {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setName("Thor");
        dog.setBreed("Rottweiler");
        dog.setAge(8);

        String dogName = dog.getName();
        System.out.println("dogName: " + dogName);

        String dogBreed = dog.getBreed();
        System.out.println("dogBreed: " + dogBreed);

        int dogAge = dog.getAge();
        System.out.println("dogAge: " + dogAge);
    }
}
