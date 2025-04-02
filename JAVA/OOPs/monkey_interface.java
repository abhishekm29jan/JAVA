package OOPs;

interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    void jump(){
        System.out.println("They can jump");
    }
    void bite(){
        System.out.println("They can bite");
    }
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("They can eat");
    }
    public void sleep(){
        System.out.println("They can sleep");
    }
}
public class monkey_interface {
    public static void main(String[] args) {
        // Human h = new Human();  
        // h.sleep();
        // h.bite();
        // h.eat();

        // Concept--= of polymorphism
        Monkey m = new Human(); // This is a human but its atrributes are of a monkey
        m.bite();
        m.jump();
       // m.eat(); not possible

       BasicAnimal ba = new Human(); // This is also a human but having attributes of a basic animal
       ba.eat();
       ba.sleep();
    //    ba.bite(); not possible
    }
}
