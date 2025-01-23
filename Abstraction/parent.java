package Abstraction;
//WHY ABSTRACTION??--> IF URE SURE THAT ITS METHOD HAS TO BE OVERRIDEN FOR SURE THEN MAKE THEM ABSTRACT
public abstract class parent {
    //this is like parents provide choice and frame for career 
    //child has to implement it itself accordingly

    int  age;
    
    public parent(int age) {
        this.age=age; //1.we cannot create  abstract constructor and we cannot create object of abstract class as if we could 
        //then we could call the methods too but methods dont have any body of its own so contradiction
    }

    //2.we cannot create static sabstract methods too as abstract methods cannot be overriden
    //3.abstrafct class can have static methods
    //4.abstract class cna have normal methods as well
    //5. from common sensewe cannot have final abstract class

    abstract void career(String name); 

    abstract void partner();
}
