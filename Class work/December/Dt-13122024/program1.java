class engine {
    void start() {
        System.out.println("Engine is starting...");
    }
}

class car {
    engine Engine;

    car (engine Engine) {
        this.Engine = Engine;
    }

    void drive() {
        Engine.start();
        System.out.println("Car is driving...");
    }
}

public class program1 {
    public static void main(String[] args) {
        engine a = new engine();
        car Car = new car(a);
        Car.drive();
    }
}