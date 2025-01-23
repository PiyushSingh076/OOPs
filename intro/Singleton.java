package intro;
//singleton class- has only one object (IMP)
//To implement a Singleton class in Java, you need to ensure that a class has only one instance 
public class Singleton {
    //if only one object then calling of constuctor of this class should not be allowed ###IMP

    private Singleton(){ // 1.now we cannot call it like Sinlgeton s=new Singleton()
        //this was the constuctor that we made private now cant call from other class
    }

    //now to get an instance lets make a function ourselves and well call it in main to craete object
    private static Singleton instance;

    public static Singleton getInstance(){ 
        //calling this in human but it needs to be static as we are calling from psvm

        //check wheter only 1 obj us created or not
        if(instance == null){
            instance =new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton s1=new Singleton();//here we can do this if main is in same class but same i did from human and
        //it shows error 
        Singleton s2=new Singleton();
    }
}
