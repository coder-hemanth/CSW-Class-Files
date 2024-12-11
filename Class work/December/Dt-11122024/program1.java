class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    void speak() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    Dog(String name) {
        super (name);
    }
    void speak() {
        System.out.println(this.name + " barks");
        super.speak();
    }
}
class program1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.speak();
    }
}