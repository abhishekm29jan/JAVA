package OOPs;

public class a3 {
    public static void main(String[] args) {
        rectangle box = new rectangle();
        box.length = 5;
        box.breadth = 2;
        box.area();
        box.perimeter();
    }
}

class rectangle {
    int length;
    int breadth;
    int area;
    int perimeter;
    public void area() {
        area = length*breadth;
        System.out.println(area);
    }
    public void perimeter() {
        perimeter = 2*(length + breadth);
        System.out.println(perimeter);
    }
}
