package OOPs;

class Aanimal {
    public static void main(String[] args) {
       Animal a = new Animal();
       a.name();
      
       
       Dog d = new Dog();
       d.voice();
       d.system();
    }
}

class Animal {
    public void name(){
        System.out.println("I am an animal");
    }
    public void voice(){
        System.out.println("I can make noises");
    }
   
}

class Dog extends Animal{
    public void system(){
        System.out.println("I have an excretory system");
    }
    
}