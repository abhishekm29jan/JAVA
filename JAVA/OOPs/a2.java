package OOPs;

public class a2 {
    public static void main(String[] args) {
        square box = new square();
        box.side = 3;
        box.area();
        box.perimeter();
    }
}

class square {
    int side;
    int area;
    int perimeter;
    public void area() {
        area = side*side;
        System.out.println(area);
    }
    public void perimeter() {
        perimeter = side*4;
        System.out.println(perimeter);
    }
}
