package Lesson1;

public class Dog {
    private String breed;
    private String color;
    private int age;

    public Dog(String breed, int age, String color) {
        if (age < 0) {
            System.out.println("You enter some thing wrong");
            age = 0;
        }

        this.breed = breed;
        this.age = age;
        this.color = color;
    }

     void bark() {
        System.out.println("Dog is barking");
    }
    void sleep() {
        System.out.println("Dog sleeping");
    }
    void eat() {
        System.out.println("Dog is eating");
    }
    public static void print(String breed, int age, String color) {
        System.out.println("breed - " + breed + ", age - " + age +", color - " + color + ".");
    }



    public static void main(String[] args) {
        Dog dog1 = new Dog("WSA", 2, "white");
        Dog dog2 = new Dog("Taksa", 2 , "black");

        dog1.bark();
        dog2.sleep();
        dog2.eat();
        print(dog1.breed, dog1.age, dog1.color);
        dog1.breed = "Haski";
        print(dog1.breed, dog1.age, dog1.color);
        dog2.print(dog2.breed, dog2.age, dog2.color);


    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("You enter some thing wrong");
            age = 0;
        }
        this.age = age;
    }
}
