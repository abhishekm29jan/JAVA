package OOPs;

abstract class Parent{
    public void greet(){
        System.out.println("Hello");
    }
    public void greet2(){
        System.out.println("Namaste");
    }
    abstract public void greet3();
    abstract public void greet4();

}

class Child extends Parent {
    public void greet3(){
        System.out.println("Kaise ho??");
    }
    public void greet4(){
        System.out.println("Hey bro");
    }
}

public class abstract_class {
    public static void main(String[] args) {
        Child c = new Child(); // object creation is possible
        // Parent p = new Parent(); -> abstract class ka object create nhi ho sakta. 
        c.greet3();
        c.greet4();
        c.greet2();
    }
}
