package Inheritence;
//we already have a box with l w h now if we want to create a box with weight instead of creating new class agian 
//simply use the properties of box and add weight into it
public class Boxweight extends Box {
    double weight;

    public Boxweight(){
        this.weight=-1;
    }

    //@Override //static methods can be inherited but not overriden 
    //(Imp)Overriding depednds on objects , static does not depend on object so static cannot be overriden
    static void greeting(){
        System.out.println("im in boxw");
    }

    public Boxweight(double l, double h, double w, double weight) { //weight automatically comes here 
        super(l, h, w);// call the parent class constructor
        //used to initialize values present in parent class
        this.weight = weight;

        //super(l,h,w); //super has to be before child properties

        System.out.println(super.w);
    }

    public Boxweight(double side,double weight){
        super(side);
        this.weight=weight;
    }

    public Boxweight(double l,double h,double weight ){
        super(l,h); //error coz box doesnt have func with two param so lets make
        this.weight=weight;
    }

    public Boxweight(Boxweight other){
        super(other); //gives u --> l,h,w
        this.weight=other.weight;
    }

    //if we create constructor suing the bulb 
    
}
