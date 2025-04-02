package OOPs;

interface Parent {
    void meth1();
    void meth2();
}

interface Child extends Parent {
    void meth3();
    void meth4();
}

class MySample implements Child {
    public void meth1(){
        System.out.println("Iam meth1");
    }
    public void meth2(){
        System.out.println("Iam meth2");
    }
    public void meth3(){
        System.out.println("Iam meth3");
    }
    public void meth4(){
        System.out.println("Iam meth4");
    }
}

public class interfaceexample2 {
    public static void main(String[] args) {
        MySample sc = new MySample();
        sc.meth1();
        sc.meth2();
        sc.meth3();
    }
}
