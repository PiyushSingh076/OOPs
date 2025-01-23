package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape =new Shapes();
        Shapes circle =new Circle(); //how is it depending on refrence type here??
        Square square=new Square();

        circle.area();

        
        
    }
}
//HOW OVERRIDNG WORKS
//NOTES: Parent obj =new Child();
//if child class method is overriden then
//which method will be called depeds on Child() therefore it roints "im circle"
//this is called UPCASTING

//During RUNTIME java decides which method to access depending on refrence type 
//however which version of this accesed func to run depends on object
//like here area in shapes will be acsessed but to decide what to run since object is circle hence 
//overriden version of area is run.....

