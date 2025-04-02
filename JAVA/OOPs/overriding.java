package OOPs;

public class overriding {
    public static void main(String[] args) {
        A a = new A();  // Object creation of class A
        a.meth2();

        B b = new B();  // Object creation of class B
        b.meth2();
        b.meth3();
    }
}

class A{  // Superclass
    public void meth1() {
        System.out.println("Iam method of A");
    }
    public void meth2() {
        System.out.println("Iam second method of A");
    }
}

class B extends A{  // Subclass
    @Override
    public void meth2() {
        System.out.println("Iam method of B"); // method overriding
    }
    public void meth3() {
        System.out.println("Iam second method of B");
    }
}