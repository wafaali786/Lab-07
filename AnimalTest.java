class Animal {
    String name;
    int age;

    
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


class Dog extends Animal {
    
    Dog(String name, int age) {
        super(name, age);
    }
}


class Cat extends Animal {
    
    Cat(String name, int age) {
        super(name, age);
    }
}

 class  Cow extends Animal {
    Cow(String name , int age ){
        super(name, age);
    }
    
}


public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy", 4);
        Cat cat = new Cat("Mano", 2);
        Cow cow = new Cow("kawo", 15);

        System.out.println("Dog Info:");
        dog.displayInfo();

        System.out.println("Cat Info:");
        cat.displayInfo();

        System.out.println("Cow Info");
        cow.displayInfo();
    }
}
