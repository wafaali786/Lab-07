public class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age); // Call Animal constructor with name and age
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }
}

public class Taste {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);

        dog.display();
        cat.display();
    }
}
