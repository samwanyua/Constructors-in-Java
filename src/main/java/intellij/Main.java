package intellij;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        Default no args constructor
        Dog myDog = new Dog("Kina", 4);
//        myDog.name = "Bosco";
        System.out.println(myDog.name);
        System.out.println(myDog.age);

        System.out.println(Constants.NUMBER_OF_DAYS_IN_A_WEEK); //7





    }
}