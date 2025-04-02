package OOPs;

public class a1 {
    public static void main(String[] args) {
        cellphone mine = new cellphone();
        mine.ringing();
        mine.vibrating();
        mine.playing();
    }
}
class cellphone {
    public void ringing() {
        System.out.println("Ringing...");
    }
    public void vibrating() {
        System.out.println("Vibrating...");
    }
    public void playing() {
        System.out.println("Playing...");
    }
}
