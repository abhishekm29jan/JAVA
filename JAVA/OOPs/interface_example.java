package OOPs;

interface Bicycle{
    int x = 23;
    void Horn();  // methods interface mein banana hai 
    void Speed();
}

class Avon implements Bicycle{
    public void Horn(){  // Implement idhar karna hai
        System.out.println("Pee Pee");
    }
    public void Speed(){
        System.out.println("Vroooommmmm");
    }
}

public class interface_example{  
    public static void main(String[] args) {
        Avon cycle = new Avon();
        cycle.Horn();
        cycle.Speed();
        // System.out.println(cycle.x); // You can create properties in interface..
        System.out.println(cycle.x); // You cannot modify the properties in interface
    }
}