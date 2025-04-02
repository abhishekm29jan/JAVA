package OOPs;

public class ownclass {
    public static void main(String[] args) {
        Employee raj = new Employee();
        raj.id = 12;
        raj.name = "Abhishek";
        raj.printdetails();
    }
}

class Employee{
    int id;
    String name;
    void printdetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
}