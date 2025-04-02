package OOPs;

abstract class pens{
    void write(){}
    void refill(){}
}

class Fountainpen extends pen{
    void write() {
        System.out.println("Writing...");
    }
    void refill(){
        System.out.println("Refilling..");
    }
    void accuracy(){
        System.out.println("Checking the accuracy...");
    }
    void speed(){
        System.out.println("Speedy...");
    }
}

public class pen {
    public static void main(String[] args) {
        Fountainpen fp = new Fountainpen();
        fp.speed();
        fp.refill();
    }
}
