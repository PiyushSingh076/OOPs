package Polymorphism;

//runtime polymorphism/dynamic achieved by method overriding --> during runtime it decides 
//compile time --> method overloading -->during copilation java decides which method to run
public class Circle extends Shapes { 
    //THIS ONE IS CALLED
    @Override //not showing any error means area is being overriden 
    public void area(){
        System.out.println("im circle");
    }
    //method override means when child has same func with same arg as parent but different body
    //@Override is annotaion to check if method is overriden
}
//OVERLOADING -->ARGUMENT TYPE DIFFERENT
//OVERRIDING--> CHILD HAS SAME FUNC SAME ARG AS PARENT JUST DIFF BODY