package DesignPatterns;

/* Design pattern where only 1 object can be created */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){

    }
    public void sayHello(String name){
        System.out.println("Hello "+name);
    }
    public static Singleton getInstance(){
        return instance;
    }
}

class Print{
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        System.out.println(obj == obj2);//Both the objects are refereing to the same instance, so only 1 copy of obj is created.
        System.out.println(obj == obj3);//Both the objects are refereing to the same instance, so only 1 copy of obj is created.
    }
}
