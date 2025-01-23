package Inheritence;
//child clas inherits property from base class
public class Box {
    private double l;
    double h;
    double w;

    static void greeting(){
        System.out.println("im in box");
    }
    Box(){
        //super(); //super points to immediate parent class but here it is not giving error

        //as every class is child of object() class so no error
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }

    Box(double l,double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }

    
    
    //cube
    Box(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }

    Box(Box old){
        this.h=old.h;
        this.h=old.h;
        this.w=old.w;
    }

    Box(double l,double h){
        this.l=l;
        this.h=h;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
