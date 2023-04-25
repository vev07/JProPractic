package Task2;

import Lesson1.Dog;

public class Test {
    public static void main(String[] args) {
        Dog dog3 = new Dog("GGGG", 5, "red");
        Task3.Dog dog = new Task3.Dog("ZZZZ",14, "blue");
        System.out.println(dog.getBreed());
        Dog dog5 = new Dog("GGGG",-4, "TTT");
        dog5.print(dog5.getBreed(), dog5.getAge(), dog5.getColor());
    }
}
