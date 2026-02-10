
class Animal {
    void sound() {
        System.out.println("Animal make a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog darks");
    }
}

class cat extends Animal {
    void sound() {
        System.out.println("cat meows");
    }
}

public class polimophism {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();

        a = new cat();
        a.sound();
    }
}
